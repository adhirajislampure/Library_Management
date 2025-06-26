import java.util.Scanner;
public class SCGU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is ur name lavde");
        String fn= sc.nextLine();
        System.out.println("what is ur age lavde");
        int ag = sc.nextInt();
        System.out.println("what is salary expectation lavde");
        double sl = sc.nextDouble();
//        System.out.println(fn);
//        System.out.println(ag);
//        System.out.println(sl);
        SCGU sd =new SCGU();
        if(ag==23){
            sd.details(fn,ag,sl);
            for (int a =1;a<=10;a++){
                System.out.println("bsdiwale");
                if(sl==100){
                    System.out.println("tu iske layak nhi lavde");
                }
            }
        }


    }
    public void details(String fn,int ag,double sl){
        System.out.println(fn);
        System.out.println(ag);
        System.out.println(sl);

    }


}
