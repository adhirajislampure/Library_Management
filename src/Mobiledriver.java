public class Mobiledriver {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.using();
        mb.bt.type="lithium";
        mb.bt.volt=150;
        mb.brand="china mi";
        mb.price=1000;
        System.out.println(mb.bt.type);
        System.out.println(mb.bt.volt);
        System.out.println(mb.brand);
        System.out.println(mb.price);
    }
}
