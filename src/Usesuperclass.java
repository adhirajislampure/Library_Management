public class Usesuperclass {
    int a;
    int b;
    int c= a+b;
    Usesuperclass(){
        System.out.println("from superclass no argument constructor");
    }
    Usesuperclass(int a, int b, int c){
        this.a=a;
        this .b=b;
        this.c=c;

    }
}
