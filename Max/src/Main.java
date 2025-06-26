public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        minInteger min1=new minInteger();

        MaxInteger maxInteger=new MaxInteger();
        int arr[]={1,2,3,4,5,67,69};

        int maxxi=maxInteger.max(arr);
        int minn=min1.min(arr);
        System.out.println(minn);
        System.out.println(maxxi);

    }
}