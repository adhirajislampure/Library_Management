public class Mobi {
    int ram;
    int price;
    String brand;
    Mobi(int ram,int price,String brand){
        this.ram=ram;
        this.price=price;
        this.brand=brand;
    }

    public static void main(String[] args) {
        Mobi m1= new Mobi(16,20000,"lenovo");
        Mobi m2 = new Mobi(16,20000,"lenovo");
        //System.out.println(m1);
       // System.out.println(m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashcode());
        System.out.println(m2.hashcode());

    }
    public boolean equals(Object o){
        Mobi m1=(Mobi)o;
        return this.ram== m1.ram && this.price==m1.price && this.brand==m1.brand;
    }
    public int hashcode(){
        return ram+price+brand.hashCode();
    }

}
