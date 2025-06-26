public class EX extends EXCEPTION{

    int a=100;
    int b=10;
    String ab="gopis topi";
    @Override
    public void adhhi(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        if (a==1){
            gopi("ur r n bullshit");

        } else if (a==2) {
            adhhi(1,2);
            gopi("yes ur bullshit");



        }



    }

    @Override
    public void gopi(String ab) {
        System.out.println(ab+" ur r fool a fool");


    }
}
