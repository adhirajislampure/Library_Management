public class Main {
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.setName("Dog");
            animal.setAge(3);

            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
        }
}
