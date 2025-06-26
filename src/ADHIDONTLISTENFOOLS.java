public class ADHIDONTLISTENFOOLS {
    int a;
    int b;

    ADHIDONTLISTENFOOLS(){
        this(10);
        System.out.println("is this ypu boy");
    }
    ADHIDONTLISTENFOOLS(int a){
        this(100,200);
        this.a=a;
        System.out.println("the number ..is "+a);

    }
    ADHIDONTLISTENFOOLS(int a,int b){
        fool(1,2);
        System.out.println(a+b);
        if(a==1&&b==2){
            for (int i=0;i<=10;i++){
                System.out.println("take a deep breath");
            }
        }
    }
    public void fool(int a,int b){
        this.b=b;
        System.out.println(b);
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        ADHIDONTLISTENFOOLS ad = new ADHIDONTLISTENFOOLS();
        ADHIDONTLISTENFOOLS ad1 = new ADHIDONTLISTENFOOLS(1,2);
    }
}
