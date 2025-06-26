public class BinarySearch {


    public static int binarySearch(int[] arr,int target){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return -1;
    }

    public static int findFirstOccurance(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println("Ellement is: "+arr[mid]+"and index is "+mid);
                result= mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }

    public static int findLastOccurance(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }

    public static int searchRotatedArray(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;

            }
            if(arr[left]<=arr[mid]){
                if(target>=arr[left] && target<arr[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(target>arr[mid]  && target<=arr[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }

        }
        return -1;
    }


    public static int findFloor(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                result=arr[mid];
                left=mid+1;
            }else{
                right=mid-1;
            }
        }  return result;
    }

}
