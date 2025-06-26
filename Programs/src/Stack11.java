public class Stack11 {

    public boolean isVallid(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' ||c=='['||c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char top=st.pop();
                    if(c==')' && top!='(' || c!='[' || top!=']'|| c=='{' && to!='}' ){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }



    /// next greater element
    public int[] nextgreaterelement(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.isEmpty()&& arr[st.peek()]<arr[i]){
                st.pop();
            }
            result[i]=st.isEmpty() ?-1:st.peek();
            st.push(arr[i]);
        }
        return result;
    }


    //evaluate postfix expression
    public int evaluatePostfix(String s){
        Stack<C> st=new Stack;
        for(char c:s.toCharArray()){
            if(cheCharacter.isDigit(c)){
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

//    public int largestListoGram(int[] arr){
//         Stack<Integer> st=new Stack<>();
//         int maxArea=0;
//         int n=arr.length;
//
//    }
}
