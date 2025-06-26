public class Stack {

//    Problem Description
//    An arithmetic expression is given by a string array A of size N.
//    Evaluate the value
//    of an arithmetic expression in Reverse Polish Notation
//    Valid operators are +, -, *, /. Each string may be an
//    integer or an operator.Note: Reverse Polish Notation is equivalent
//    to Postfix Expression, where operators are written after their operands.

//    Stack<Integer> st=new Stack<>();
//        for(String token:A){
//        //check if the token is an operator
//        if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
//            //pop the two elem
//            int b=st.pop();
//            int a=st.pop();
//            int result=0;
//            //perform operations
//            switch(token){
//                case "+":
//                    result=a+b;
//                    break;
//                case "-":
//                    result=a-b;
//                    break;
//                case "*":
//                    result=a*b;
//                    break;
//                case "/":
//                    result=a/b;
//                    break;
//            }
//            //push the result back to the stack
//            st.push(result);
//        }else{
//            //if it's a number push into the stack
//            st.push(Integer.parseInt(token));
//        }
//    }
//    //the result will be only the elem of the stack
//        return st.pop();
//
//
//        public static void stack(list<String> A){
//
//            Stack st=new Stack();
//
//
//
//        }

public static void stack(String A){
    Stack st=new Stack();
    for(int i=0;i<A.length();i++){
        if(A.charAt(i)!='+' && A.charAt(i)!='-' && A.charAt(i)!='*' && A.charAt(i)!='/'){
            st.push(A.charAt(i));
        }else{
            int b=st.pop();
            int a=st.pop();
            int result=0;
            switch(A.charAt(i)){
                case '+':
                    result=a+b;
                    break;
                case '-':
                    result=a-b;
                    break;
                case '*':
                    result=a*b;
                    break;
                case '/':
                    result=a/b;
                    break;
            }
            st.push(result);
        }

    }
}



}
