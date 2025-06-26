public class Stack<C> {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }

    public void push(int value){
        if(top<maxSize-1){
            stackArray[++top]=value;
        }
    }
    public int pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }
        return -1;
    }

    public boolean isEmpty(){
        return(top==-1);
    }


//    Reverse a String Using Stack

    public String ReverseString(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuillder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();


    }


//    Check For the balanced Parenthesis expression

    public boolean isBalanced(String expr){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<expr.length();i++){
            char ch=expr.charAt(i);
            if(ch=='(' ||ch=='{'||ch=='['){
                st.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                char top= (char) st.pop();
                if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public int evaluatePostfix(String expr){
        Stack<Integer> st=new Stack<>();
        for(char c:expr.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            }else{
                int val1=st.pop();
                int val2=st.pop();
                switch(c){
                    case'+':
                        st.push(val2+val1);
                    case'-':
                        st.push(val2-val1);
                    case'*':
                        st.push(val2*val1);
                    case'/':
                        st.push(val2/val1);


                }
            }
        }
        return st.pop();
    }

//    Next Greater Element;

    public int[] nextGreaterElement(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            result[i]=st.isEmpty() ?-1:st.peek();
            st.push(arr[i]);
        }
        return result;
    }


//    sort a stack

    public void sortStack(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp=st.pop();
            sortStack(st);
            insertSorted(st,temp);
        }
    }

    private void insertedSorted(Stack<Integer> st,int element){
        if(st.isEmpty()|| element>st.peek()){
            st.push(element);
        }else{
            int temp=st.pop();
            insertedSorted(st, element);
            st.push(temp);
        }
    }



    //Reverse a String using Stack

    public static java.lang.String reverseString(String str){
        Stack<C> st=new Stack<C>;
        for(char c:str.toCharArray()){
            st.push(c);
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();

    }

//    Check VallidParenthesis
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if()
            }
        }
        //evaluate postfix expression

//        public static int evaluatePostfix(String str){
//            Stack<Integer>
//        }
//    }vallid parenthesis


//public boolean isVallid(String s){
//Stack<Character> st=new Stack<Character>();
//for(char c:s.toCharArray()){
//if






//
///}
}
}