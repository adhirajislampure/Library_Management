public class Leapyear1 {
    public static void main(String[] args) {
        int year=2023;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap yaer"+year);
                }else{
                    System.out.println("leap not year");
                }
            }else{
                System.out.println("leap year");
            }
        }else{
            System.out.println("not a leap yaer");
        }
    }
}
