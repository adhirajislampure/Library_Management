public class Car {
    String brand;
    String color;
    ENgine e1 = new ENgine();
    Car(){
        System.out.println("car object get created ");
    }
    public void ride(){
        System.out.println("im riding");
    }
}
