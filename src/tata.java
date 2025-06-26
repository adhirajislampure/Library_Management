public class tata {

    int a;
    {
        System.out.println("im from non static constructor");
    }
    tata(){
        System.out.println("im from constructor");
    }
    tata(int a){
        System.out.println(a+"is this is an default value");
    }

    public void gettt(){
        System.out.println("im from method");
    }

}
