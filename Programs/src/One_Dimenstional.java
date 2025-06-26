import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class One_Dimenstional {

//    Sum of array element

    public int sum(int[] arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }

//    Count even and odd numbers
    public void countEvenOdd(int[] arr){
        int n=arr.length;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
    }
//    Find Largest Element
    public int findLargest(int[] arr){
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

//    Find Peak Elements Elements larger than their neighBour

    public List<Integer> findPeak(int[] arr){
        int n=arr.length;
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    //Leaders in array elements greater than all elements to their right;

    //print elements of an array

    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

//    Count Even and Odd Numbers

    public void countEvenOddd(int[] arr){
        int n=arr.length;
        int even=0;
        int odd=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }


    }

//    Find Second Llargest Element
    public static int findSecondLargest(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    //Remove Duplicates from an sorted Array;
    public int[] removeDuplicates(int[] arr){
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int[] result=new int[set.size()];
        int i=0;
        for(Integer num:set){
            result[i++]=num;
        }
        return result;
    }


//    Rotate Array By K Position

    public void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    private void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public int findMajorityElement(int[] arr){
        int count=1;
        int candidate=arr[0];
        for(int i=1;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            else if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

//    HARD LEVEL KADANES ALGORITHMS

    public static int maxSubarray(int[] arr){
         int maxSoFar=arr[0];
         int maxEndingHere=arr[0];

         for(int i=1;i<arr.length;i++){
             maxEndingHere=Math.max(arr[i],maxEndingHere+arr[i]);
             maxSoFar=Math.max(maxSoFar,maxEndingHere);
         }
         return maxSoFar;
    }

    ///Find an Equilibrium Point
    public static int findEquilibriumPoint(int[] arr){
        int totalSum=0;
        int leftSum=0;
        for(int num:arr){
            totalSum+=num;
        }

        for(int i=0;i<arr.length;i++){
            totalSum-=arr[i];//rightSum
            if(leftSum==totalSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }


    //Trapping Rain Watter Problem

    public static int trapWater(int[] height){
        if(height.length<3){
            return 0;
        }
        int left=0,right=height.length-1;
        int leftMax=0,rightMax=0;
        int water=0;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax=height[left];
                }else{
                    water+=leftMax-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightMax){
                    rightMax=height[right];
                }else{
                    water+=rightMax-height[right];
                }
                right--;
            }

        }
        return water;

    }

    //longest COnsecutive Sequence
    public static int longestConsecutiveSequence(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }

        int longestStreak=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }

                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;

    }
    //find peak element in an array
    public static int findPeakElement(int[] arr){
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[n-1]>=arr[n-2]){
            return n-1;
        }
        //check remainig element
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]){
                return i;
            }
        }
        return -1;
    }


    //leaders in array Element
    public static List<Integer> findLeaders(int[] arr){
        List<Integer> leaders=new ArrayList<>();
        int n=arr.length;
        int maxRight=arr[n-1];
        leaders.add(maxRight);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxRight){
                leaders.add(arr[i]);
                maxRight=arr[i];
            }
        }
        return leaders;
    }


    //leaders in array element

    public static List<Integer> findLeaderss(int[] arr){
        List<Integer> leaders=new ArrayList<>();
        int n=arr.length;
        int maxRight=arr[n-1];
        leaders.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxRight){
                maxRight=arr[i];
            }
        }
        return leaders;
    }

//    find leaders one more time

    public staic List<Integer> java.util.List<Integer> findLeaders(int[] arr){
        List<Integer> leaders=new ArrayList<>();
        int n=arr.length;
        int maxRight=arr[n-1];
        leaders.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxRight){
                maxRight=arr[i];
            }
        }
        return leaders;

    }


    //wave Array(Array arranged in wave form)
    public static void waveArray(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            //swap adjacent elements
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;


//            int temp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=temp;
        }
    }

    //find missing numbers in array(1 to n)

    public static int findMissingNumber(int[] arr,int n){
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;
        for(int num:arr){
            actualSum+=num;
        }
        return expectedSum-actualSum;

    }

    //rearrange array (positive and negative numbers)

    public static void rearrangeArray(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        int positiveIndex=0,negativeIndex=1;

        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                if(positiveIndex<n){
                    temp[positiveIndex]=arr[i];
                    positiveIndex+=2;
                }else{
                    if(negativeIndex<n){
                        temp[negativeIndex]=arr[i];
                        negativeIndex+=2;
                    }
                }

            }
            System.out.arraycopy(temp,0,arr,0,n);
        }
    }
    public static void leftRotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


    public static void bubleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    //remove duplicate from sorted Array
    public static int removeDuplicat(int[] arr){
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex]=arr[i];
            }
        }
        return uniqueIndex+1;
    }

    public static int[] mergeSortedArrays(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;

        int[] merge=new int[n1+n2];
        int i=0,k=0,j=0;
        while(i<n1 &&j<n2){
            if(arr1[i]<=arr2[j]){
                merge[k++]=arr1[i++];
            }else{
                merge[k++]=arr2[j++];
            }
        }
        while(i<n1){
            merge[k++]=arr1[i++];
        }
        while(j<n2){
            merge[k++]=arr2[j++];
        }
        return merge;
    }



    //find equailibrium point

    public static int findequalibrium(int[] arr){
        int sum=0;
        int leftSum=0;

        for(int num:arr){
            sum+=num;
        }
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(leftSum==sum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }





}
