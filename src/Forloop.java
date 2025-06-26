import java.util.Scanner;

public class Forloop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter n");
        int n=sc.nextInt();

        int count=0;

        for(int i=1;i<=n;i++){

            if(i%n==0) {
                System.out.print(i+" ");
            }

        }
       // System.out.print(count+" ");
    }
}
