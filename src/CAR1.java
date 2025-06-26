public class CAR1 extends FOURWHEELER{
    String brand;
    CAR1(){

    }
    CAR1(String brand){
        super(4);
        this.brand=brand;


    }
    public void detailsofcar(){
        System.out.println("Vehicle no .."+vehicleno);
        System.out.println("no of tyres..."+nooftyres);
        System.out.println("brand name..."+brand);

    }

}
