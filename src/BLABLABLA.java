public class BLABLABLA {
    int a ;
    String b;
    BLABLABLA(){
        this(1);
        System.out.println("kmsm");

    }
    BLABLABLA(int a){
        this(3,"boss");
        System.out.println("number is "+a);

    }
    BLABLABLA(int a,String b){
        this(10,11,"adhi");

        System.out.println(a);
        System.out.println(b);
    }
    BLABLABLA(int a,int b,String c){
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
    }

    public static void main(String[] args) {
        BLABLABLA bl = new BLABLABLA();

    }
}
