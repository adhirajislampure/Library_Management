public class Spider {

    {
        System.out.println("its an non static block");
    }
    static{
        System.out.println("its an static block");
    }
    int i;
    Spider(int i){
        System.out.println("Spider is runnig" + i);
        this.i=i;
    }
    public void tt(){
        System.out.println("im from tt");
    }

    public static void vv(){

        System.out.println("fromm vv");

    }

}
