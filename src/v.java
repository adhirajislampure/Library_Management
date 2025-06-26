public class v {

    v(int a,int b,int c){
        System.out.println(a+b+c);

    }
    int a;
    int b;
    int c;

    public int b(int a,int b,int c){

        return a+b+c;

    }
    public static void main(String[] args) {
        v b=new v(100,2000,300);
        System.out.println(b.b(1,2,3));
        System.out.println(gopi("manthan","siddya","loukya"));


    }
    String x="gopi";
    String y="topi";
    String z="fopi";
    public static String gopi(String x,String y,String z){

        if (x=="manthan"){
            for (int i=1;i<=3;i++){
                System.out.println(y);
            }

        }

        System.out.println(x+" im yeda mantya tantya");
        System.out.println(y+" im yeda atank");
        System.out.println(z+" im yeda lokyya");
        return x+y+z;
    }
}
