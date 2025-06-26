import java.util.Arrays;

public class TwoPointers {

    public static void findSumPair(int [] arr,int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Pair found at index "+left+" and "+right);
            }else if(sum<target){
                left++;
            }else{
                right--;
            }

        }
    }




    Problem Description

//    Given N non-negative integers A[0], A[1], ..., A[N-1] , where each represents
//    a point at coordinate (i, A[i]).N vertical lines are drawn such that the two
//    endpoints of line i is at (i, A[i]) and (i, 0).Find two lines, which together
//    with x-axis forms a container, such that the container contains the most water
//    . You need to return this maximum area.
//    Note: You may not slant the container. It is guaranteed that the
//    answer will fit in integer limits.

    public static int maxArea(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int maxArea=0;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            int currentArea=width*h;
            maxArea=Math.max(maxArea,currentArea);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;

    }

//    Given an array of positive integers A and an integer B,
//    find and return first continuous subarray which adds to B.
//    If the answer does not exist return an array with a single integer "-1".
//    First sub-array means the sub-array for which starting index in minimum.

    public static int[] findSubarrayWithSum(int[] A,int B) {
        int n = A.length;
        int left = 0;
        int right = 0;
        int currentSum = 0;
        while (right < n) {
            currentSum += A[right];
            while (currentSum > B && left <= right) {
                currentSum -= A[left];
                left++;
            }
        }

        if (currentSum == B) {
            int[] result = new int[right - left + 1];
            int index = 0;
            for (int i = left; i <= right; i++) {
                result[index++] = A[i];
            }
            return result;
        }
        right++;

        return new int[]{-1};

    }



//    Problem Description
//    Given a sorted array of integers (not necessarily distinct) A and an integer B,
//    find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum
//    equal to B.
//    Since the number of such pairs can be very large, return number of such pairs
//    modulo (109 + 7).
//

    public int solve(int[] A, int B) {
        int n = A.length;
        int i = 0, j = n - 1;
        long ans = 0;
        long mod = 1000000007L;  // Correct modulus

        Arrays.sort(A);

        while (i < j) {
            int sum = A[i] + A[j];

            if (sum > B) {
                j--;
            } else if (sum < B) {
                i++;
            } else {
                if (A[i] == A[j]) {
                    long count = j - i + 1;
                    ans = (ans + count * (count - 1) / 2) % mod;
                    break;
                } else {
                    int count1 = 0, count2 = 0;
                    int ii = i, jj = j;

                    while (ii <= j && A[ii] == A[i]) {
                        count1++;
                        ii++;
                    }
                    i = ii;

                    while (jj >= i && A[jj] == A[j]) {
                        count2++;
                        jj--;
                    }
                    j = jj;

                    ans = (ans + (long) count1 * count2) % mod;
                }
            }
        }
        return (int) ans;
    }

//    Problem Description
//    Given an one-dimensional integer array A of size N and an integer B.
//    Count all distinct pairs with difference equal to B.
//    Here a pair is defined as an integer pair (x, y),
//    where x and y are both numbers in the array and thei
//    r absolute difference is B.

    public static int countDistinctPairs(int[] A,int B){
        Arrays.sort(A);
        int n=A.length;
        int left=0;
        int right=1;
        int count=0;

        while(right<n){
            int diff=A[right]-A[left];
            if(diff==B && left!=right){
                count++;
                int currentLeft=A[left];
                while(left<n && A[left]==currentLeft){
                    left++;
                }
                int currentRight=A[right];
                while(right<n && A[right]==currentRight){
                    right++;
                }
            }
            else if(diff<B){
                right++;
            }else{
                left++;
            }
            if(left>=right){
                right=left+1;
            }
        }
        return count;
    }

//    Problem Description
//    Given an array A of N integers, find three integers in A such that
//    the sum is closest to a given number B. Return the sum of those three integers.
//    Assume that there will only be one solution.

    public static int threeSumClosest(int[] A,int B){
        Arrays.sort(A);
        int n=A.length;
        int closestSum=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int currentSum=A[i]+A[left]+A[right];

                if(currentSum==B){
                    return currentSum;
                }

                if(Math.abs(currentSum-B)<Math.abs(closestSum-B)){
                    closestSum=currentSum;
                }

                if(currentSum<B){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closestSum;
    }




  //  Problem Description
//    Given a sorted array of integers (not necessarily distinct) A and an integer B,
//    find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum
//    equal to B.
//    Since the number of such pairs can be very large, return number of such pairs
//    modulo (109 + 7).
//

//    public int solve(int[] A, int B) {
//        int n = A.length;
//        int i = 0, j = n - 1;
//        long ans = 0;
//        long mod = 1000000007L;  // Correct modulus
//
//        Arrays.sort(A);
//
//        while (i < j) {
//            int sum = A[i] + A[j];
//
//            if (sum > B) {
//                j--;
//            } else if (sum < B) {
//                i++;
//            } else {
//                if (A[i] == A[j]) {
//                    long count = j - i + 1;
//                    ans = (ans + count * (count - 1) / 2) % mod;
//                    break;
//                } else {
//                    int count1 = 0, count2 = 0;
//                    int ii = i, jj = j;
//
//                    while (ii <= j && A[ii] == A[i]) {
//                        count1++;
//                        ii++;
//                    }
//                    i = ii;
//
//                    while (jj >= i && A[jj] == A[j]) {
//                        count2++;
//                        jj--;
//                    }
//                    j = jj;
//
//                    ans = (ans + (long) count1 * count2) % mod;
//                }
//            }
//        }
//        return (int) ans;
//    }









}


