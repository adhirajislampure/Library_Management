import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Checkdone checkdone=new Checkdone();
        Checking checking=new Checking();
        checking.setId(1);
        checking.setName("Adhiraj");
        checking.setEmail("adhirajislampure549@gmail.com");
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
        System.out.println("addd your name");
        String name2= scanner.nextLine();
        System.out.println("add your email");
        String email=scanner.nextLine();



            if (name2.equals(checking.getName())) {
                if (email.equals(checking.getEmail())) {
                    System.out.println("Log in successfull");
                    break;
                } else {
                    System.out.println("plese enter vallid email");
                }
            } else {
                System.out.println("plese enter vallid name");
            }
        }



    }
}
