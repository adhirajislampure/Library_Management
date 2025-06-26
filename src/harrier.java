public class harrier extends tata {

    harrier(){
        tata t1=new tata(100);
        t1.gettt();
    }
    public static void main(String[] args) {

        tata t = new tata();
        t.gettt();
        System.out.println(t.a);
        t.a=100;
        System.out.println(t.a);
    }
}