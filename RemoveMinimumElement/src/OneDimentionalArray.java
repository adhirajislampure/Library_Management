public class OneDimentionalArray {

    public static int findmin(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }


    public static int findmax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void reverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }


    public static int findMissingNumber(int arr[],int n){
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;

        for(int i=0;i<arr.length;i++){
            actualSum+=arr[i];
        }
        int missingNumber=expectedSum-actualSum;
        return missingNumber;
    }



    public static void findDupicate(int arr[]){
        HashSet<Integer> seen=new HasSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }

        }
        System.out.println("Duplicates elements"+duplicates);

    }

    public static void moveZerosToEnd(int[] arr){
        int nonZeroIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonZeroIndex]=arr[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex<arr.length){
            arr[nonZeroIndex]=0;
            nonZeroIndex++;
        }
    }

    public static void findPairsWithSum()
}
