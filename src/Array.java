import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Checking checking=new Checking();

        String name="adhu";
        int age=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String name1=scanner.nextLine();
//        System.out.println("enter your age");
//        int age1=scanner.nextInt();




        ArrayList<String> list=new ArrayList<>();
        list.add(name);
        list.add(name1);
        System.out.println(list.contains(name));

        if (list.contains(name.equals(name1))) {
            System.out.println("taa bhai yo dne it");
        }

       // arrayList.indexOf(name.equals(name1));
//        if(arrayList.contains(name.equals(name1))){
//            if(arrayList.contains(age==age1)){
//                System.out.println("bhai tune krrdikaya");
//            }
        //}
    }
}
