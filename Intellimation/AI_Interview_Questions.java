public class AI_Interview_Questions {
    //Given an array split it,sort each half,and merge in zigzag pattern
    public int[] splitzigzag(int[] arr){
        int n=arr.length;
        int mid=n/2;
        int[] firstHalf=Arrays.copyOfRange(arr,0,mid);
        int[] secondHalf=Arrays.copyOfRange(arr,mid,n);
        Arrays.sort(firstHalf);
        Arrays.sort(secondHalf);
        int[] result=new int[n];
        int i=0,j=0,k=0;
        while(i<firstHalf.length && j<secondHalf.length){
            result[k++]=firstHalf[i++];
            result[k++]=secoundHalf[j++];
        }
        while(i<firstHalf.length){
            result[k++]=firstHalf[i++];
        }
        while(j<secondHalf.length){
            result[k++]=secondHalf[j++];
            return result;
        }
    }


    //given ann array splitzigzag
    public int[] splitzigzag(int[] arr){
        int n=arr.length;
        int mid=n/2;
        int[] firstHalf=Arrays.copyOfRange(arr,0,mid);
        int[] secondHalf=Arrays.copyOfRange(arr,mid,n);
        Arrays.sort(firstHalf);
        Arrays.sort(secondHalf);
        int[] result=new int[n];
        int i=0,int j=0,k=0;
        while(i<firstHalf.length && j<secondHalf.length){
            result[k++]=firstHalf[i++];
            result[k++]=secondhalf[j++];
        }
        //Add remainig elements if any
        while(i<firstHalf.length){
            result[k++]=firstHalf[i++];
        }
        while(j<secondHalf.length){
            result[k++]=secondHalf[j++];
        }
        return result;
    }


    // Find the element just greater than a target in a rotated sorted array using binary search

    public int findElement(int[] arr,int target){
        int left=0,right=arr.length-1;
        int ceiling=-1;
        whiel(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return arr[mid+1];
            }
            if(arr[mid]>target){
                ceiling=arr[mid];
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ceiling;
    }

    //how to detect a loop and find the middle element in a circular linked list
    class LisNode{
        int val;
        ListNode next;
        ListNode(int Val){
            this.val=val;
        }


        public ListNode detectLoop(ListNode head){
            if(head==null ||head.next==null){
                return null;
            }
            ListNode slow=head,fast=head;

            while(fast!=null && fast.next==null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    break;
                }

                if(fast==null || fast.next==null){
                    return null;
                }
                slow=head;
                fast=head;
                while(fast.next!=null && fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                    }
                return slow;
                }
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    }

    //identify lower and upper bounds in a range using hashMap
    public int[] findBounds(HashMap<Integer,Integer> ranges,int target){
        int lower=-1,upper=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(Map>Entry<Integer,Integer> entry:ranges.entrySet(){
            int start=entry.getKey();
            int end=entry.getValue();
            if(target>start && target<end){
                lower=start;
                upper=end;
                break;
            }
        }
        return new int[]{lower,upper};

    }


    //write a function to check if a String is Palindrome ,ignoring special character
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length-1;
        s=s.toLowerCase().replaceAll("[a-z0-9]","");
        while(left<right){
            if(s.charAt(left)!=s.charAt(right){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

////How do you perform traversal in graph
//explain two common graph traversal method: depths-first approach
//breadth first approaches
//
//Dfs--uses recursive or a stack to explore as far as possible along each branch
//BFs--uses queue to explore all neighboures at the current depth before moving deeper


public void dfs(int node,List<List<Integer>> adj,boolean[] visited){
    visited[node]=true;
    System.out.println(node+" ");

    for(int neighbor:adj.get(node){
        if(!visited[neighbor]){
            dfs(neighbor,adj,visited);
        }
    }
}


//given an array split it sort it each half and merge int a zig zag pattern

public int[] zigzag(int[] arr){
    int n=arr.length;
    int mid=n/2;
    int[] firstHalf=Arrays.copyOfRange(ar,0,mid);
    int[] secondHalf=Arrays.copyOfRange(arr,mid,n);
    Arrays.sort(firstHalf);
    Arrays.sort(secondHalf);
    int[] result=new int[n];
    int i=0,int j=0,int k=0;
    while(i<firstHalf.length && j<secondHalf.length){
        result[k++]=firstHalf[i++];
        result[[k++]=secondHalf[j++];]
    }

    while(i<firstHalf.length){
        result[k++]=firstHalf[i++];

    }
    while(j<secondHalf.length){
        result[k++]=secondHalf[j++];
    }
}
return result;


// find the element just greater than a target int a rotatonal sorted array using binary search
public int findElement(int[] arr,int target){
    int left=0;
    int right=arr.length-1;
    int ciling=-1;
    while(left<right){
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return arr[mid+1]);
        }else if(arr[mid]>target){
            ceiling=arr[mid];
            right=mid-1;
        }else{
            left=mid+1;
        }
        }
    return ceiling;
        }

        //how to detect a loop and find the middle element in a circlular linked list
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
    public ListNode detectLoop(ListNode head){
        if(head==null ||head.next==null){
            return null;
        }
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next
        }
    }
        }
        // identify lower and upper bounds in a range using hashMap

public int[] findBounds(HashMap<Integer,Integer> ranges,int target){
    int lower=-1,upper=-1;
    for(Map.Entry<Integer,Integer> entry:ranges.entrySet()){
        int start=entry.getKey();
        int end=entry.getValue();
        if(target>=start &&target<=end){
            lower=start;
            upper=end;
            break;
        }
    }
    return new int[]{lower,upper};
}

public int[] findBounds(HashMap<Integer,Integer> map,int target){
    int lower=-1,upper=-1;
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        int start=entry.getKey();
        int end=entry.getValue();
        if(target>=start && target<=end){
            lower=start;
            upper=end;
            break;
        }
    }
    return new int[]{lower,upper};
}


//find bound
public int[] findBound(HashMap<Integer,Integer> map,int target){
    int lower=-1,upper=-1;
    for(Map.Entry<Integer,Integer> entry:map.entrySet())){
                int start=map.getKey();
                int end=map.getValue();
                if(target>=start && target<=end){
                    upper=start;
                    lower=end;
                }
    }
}return new int[]{lower,upper;}



// write a functiion to check if String is palindrome or not
public boolean isPalindrome(String s){
    int left=0,right=s.length()-1;
    s=s.toLowerCase().replaceAll("[^a-z0-9]","");
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
            left++;
            right--;
        }
        return true;
        }
        }

        //check the given string is palindrome or not
public boolean isPalindrome(String s){
    int left=0,right=s.length()-1;
    s=s.toLowerCase().replaceAll("[^a-z0-9]","");
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
            left++;
            right--;
        }
        return true;
        }
        }

        public boolean isPalindrome(String s){
    int left=0,right=s.length()-1;
    s=s.toLowerCase().replaceAll(^[a-z0-9],"");
   }




   // given an array split it sort it each half and merge in a zigzag pattern

public int[] zigzag(int[] arr){
    int n=arr.length;
    inid=n/2;
    int[] firstArray=Arrays.copyOfrange(arr,0,mid);
    int[] secondArray=Array.copyOfRange(arr,mid,n);
    Arrays.sort(firstArray);
    Arrays.sort(secondArray):
        int[] result=new int[n];
    int i=0,j=0,k=0;
    while(i<firstArray.length && j<secondArray.length){
        result[k++]=firstArray[i++];
        result[k++]=secondArray[j++];;
        }
    while(i<firstArray.length){
        result[k++]=firstArray[i++];
        }
    while(j<secondArray.length){
        result[k++]=secondArray[j++];
        }
    return result;
        }

        //public int findElement(int[] arr,int target){
public int findElementJustGreater(int[] arr,int target){
    int left=0,right=arr.length-1;
    int ceiling=-1;
    while(left<right){
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return arr[mid+1];
        }else if((arr[mid])<target){
            ceiling=arr[mid];
            right=mid-1;
        }else{
            left=mid+1;
        }
        return ceiling;
        }
        }



        // how to detect a loop

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
    public ListNode detectListNode(ListNode head){
        if(head==null ||head.next==null){
            return null;
        }
        ListNode slow=head,fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
            if(fast==null || fast.next==null){
               // return null;
                slow=head;
                fast=head;
                while(fast.next!=null && fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return slow;
            }

        }

        public ListNode detectAloop(ListNode head){
            if(head==null || head.next==null){
                return null;
            }
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    break;
                }

            }
        }
    }


    //identify lower and upper bounds in arange using HashMap
    public int[] findupperAnd LowerBounds(HashMap<Integer,Integer> ranges,int target){
        int lower=-1,upper=-1;
        for(ranges.Entry<Integer,Integer> entry:entry.entrySet()){
            int start=entry.getKey();
            int end=entry.getValue();
            if(start>target &&end<target){
                lower=start;
                upper=end;
                break;
            }
            return new int[]{lower,upper};
        }
    }

    public boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        s=s.toLowerCase().replaceAll(["^a-z0-9"],"");

        //jhow do you perform traversal in graph
        //dfs--uses recursion or a stack to explore as far as possible along each branch
        Bfs:uses queue to explore all neighbours at the current depth before moving furthur
                //dfs--uses recursion or a stack to exploreas far as possible along each side
        //bfs--uses queue to explore all neighbour at the current depth before moving deeper
        public void dfs(int node,List<List<Integer>> adj,boolean[] visited){
            visited[node]=true;
            System.out.println(node+"");
            for(int neighbor:adj.get(node)){
                if(!visited[neighbour]){
                    dfs(neighbor,adj,visited);
                }
            }
        }


        public voiid dfs(int node,List<<List<Integer>> adj,boolean[] visited){
            visited[node]=true;
            system.out.print(node+"");
            for(int neighbor:adj.get(node)){
                if(!visited[neighbor]){
                    dfs(neighbor,adj,visited);
                }
            }
        }
        disscuss application (eg dfs for cycle bfs for shortest path);
        time complexcity O(V+E)

        //CAN YOU SOLVE PROBLEMS USING BACKTRACKING TECHNIQUES
        //ANSWER--BACKTRACKING IS A RECURSIVE ALGORITHM TECHNIQUE WHEN A SOLUTION FAILS EXAMPLE N-QUEENS PROBLEM

        Public<List<List<String>> solveNQueens(int n){
            List<List<String>> result=new ArrayList<>();
            char[][] board=new char[n][n];
            for(char[] row:board) Arrays.fill(row,"");
            backtrack((board,0,result);
            return result)

            public void backtracking(int[][] board,int row,List<List<String>> result){
                if(row==board.length){
                    result.add(construct(board));
                    return;
                }
            }for(int col=0;col<board.length;col++){
                if (isSafe(board, row, col)) {

                    board[row][col]='Q';
                    backtrack(board, row+1, result);
                }
            }
        }


        // explain a deadlock scenarion using threading
        //a deadlock occurs when two or more threads hold resources and wait for each others resorces causing a circular dependency

        public class deadLockExample{
            public static void main(String[] args){
                String resourse1="Resource1;
                String Resource2="Resource2";
                Thread t1=new Thread(()->{
                    synchronized(resource1){
                        System.out.println("Thread 1:Locked Resource 1");
                        synchronized(resource2){
                            System.out.println("Thread 1:Locked Resourse"2)
                        }
                    }
                })//explain the four conditions (mutual exclusive,hold and wait,no preemption,circular wait)
                //suggest prevention(eg lock ordering,timouts)


                how do you perform validations at the controller level in spring boot
                        // use @valid or @validated annotations with bean validations eg notnull size handle validation errors using bindingresult or global exception handling


                @PostMapping("/users" +
                        "public responseEntity<> createUser(@valid @RequestBody UserDto user,BindingResult){" +
                        ")

            }
        }
    }
}




