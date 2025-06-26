public class Primeno {
    public static void main(String[] args) {
        int no=4;
        int temp=0;
        for(int i=2;i<=no-1;i++){
            if(no%i==0){
                temp=temp+1;
            }
        }if(temp>0){
            System.out.println("not a prime");
        }else{
            System.out.println("prime no");
        }
    }
}
