public class LeapYear {
    public static void main(String[] args) {
        int year=2028;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year "+year );
                }else{
                    System.out.println("Not a leap year"+year);
                }
            }else{
                System.out.println("Leap year"+year);
            }
        }else{
            System.out.println("not aleap year");
        }
    }
}
