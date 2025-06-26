public class FOURWHEELER extends VEHICLE1{
    int nooftyres;
    FOURWHEELER(){

    }
    FOURWHEELER(int nooftyres){
        super("MH 43 AJ 262");
        this.nooftyres=nooftyres;
    }
    public void detailsoffourwheeler(){
        System.out.println("vehicle is .."+vehicleno);
        System.out.println("no of tyres..."+nooftyres);
    }

}
