public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        RemoveMInimum  removeMInimum=new RemoveMInimum();
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        ArrrayList<Integer> arry=removeMInimum.removeMin(arr);
//       // System.out.println(arry);
        BinarySearch bs=new BinarySearch();
        int[] arr={1,1,1,1,2,2,3,4,5,6,6,7,8,9};
        int target=6;
        int first=bs.findFirstOccurance(arr, target);
        System.out.println(first);
//        int caught=bs.binarySearch(arr,target);
//        System.out.println(caught);
    }
}