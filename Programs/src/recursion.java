public class recursion {


    //Factorial calculation
    public static int factorial(int n){
        if(n==0|| n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //fibonacci series
    public static int fibonacci(int n){
        if(n==0|| n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //sum of natural numbers;

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    //print all numbers from 1 to n
    public static void printAllNumbers(int n){
        if(n==0){
            return;
        }
        printAllNumbers(n-1);
        System.out.println(n +" ");

    }

    //reverse a string
}
