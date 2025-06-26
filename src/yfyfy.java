public class yfyfy {
    int a=1;
    int b=2;
    yfyfy(int a,int b){
        this.a=a;
        this.b=b;
    }
    void lb(int a,int b){
        System.out.println(a + b);
        if(a>=b){
            b++;
        }
        else{
            a++;
        }
    }
    static {
        System.out.println("lavde");
    }
    {
        System.out.println("lavde tuuu");
    }



}
class g{
    public static void main(String[] args) {
        yfyfy l = new yfyfy(1,2);
        l.lb(2,1);
        System.out.println(l.a++  + " this is a");
        System.out.println(l.b++  + " this is b");



    }

}
