public class TwoPointers {
//    Reverse an Array

    public void reverseArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
//    Vallid Palindrome

    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){

            while(left<right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            if(Chharacter.toLowerCase(s.charAt(left)!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    //Remove Duplicates From Sorted Array
    public int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

//    Container With Mst Water

    public int maxArea(int[] height){
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,width*h);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

//    Sort Colors DutchNational Flag Problem

    public void sortColors(int[] nums){
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(mid<=right){
          if(nums[mid]==0){
              swap(nums,left,mid);
              left++;
              mid++;
          }else if()
        }
    }
}
