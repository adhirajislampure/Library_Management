public class ZOOMCAR3 extends ZOOMCAR1 {
    int price ;
    ZOOMCAR3(){}
    ZOOMCAR3(int price,int wheels,String car){
        this.price=price;
        System.out.println(car);
        System.out.println(price);
        System.out.println(wheels);

    }
    public void zem(int price,int wheels,String brand){
        System.out.println(brand + wheels + price);
        System.out.println(wheels);
        System.out.println(price);
    }

    public static void main(String[] args) {
        ZOOMCAR zc = new ZOOMCAR3(10500,4,"bmw");
        zc.car="mercedes";
        ZOOMCAR3 z3 = new ZOOMCAR3();
        z3.zem(100000,4,"BMW");


    }

}
