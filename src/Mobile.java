public class Mobile {
    String brand;   // Attributes data
    int price;      // Attributes data
    Battery bt=new Battery(); //Early bing
    Mobile(){
        System.out.println("mobile object created");
    }
    void using(){
        bt.charging(); // lazy binding
        System.out.println("im using mobile");
    }
}
