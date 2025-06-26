public class Cardriver {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.ride();
//        ENgine e1 = new ENgine();
//        e1.start();
        obj1.brand="bmw";
        System.out.println(obj1.brand);

        obj1.color="red";
        System.out.println(obj1.color);
        obj1.e1.fuel="litre";
        obj1.e1.cc=1800;
        System.out.println(obj1.e1.cc);
        System.out.println(obj1.e1.fuel);
        obj1.e1.start();


    }
}
