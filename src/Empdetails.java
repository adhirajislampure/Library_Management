public class Empdetails {
    String name;
    int age;
    int salary;
    String maritalstatus;

    Empdetails(String name,int age,int salary,String maritalstatus){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.maritalstatus=maritalstatus;
    }

    public static void main(String[] args) {
        Empdetails e1 = new Empdetails("adhi",18,1000000,"single");
        //Empdetails e2= new Empdetails("gopi",99,10,"yes");
        System.out.println(e1);
        System.out.println(e1.hashCode());
        //System.out.println(e2);
        System.out.println(e1.toString());
    }
    public String toString(){
        return name+""+age+""+salary+""+maritalstatus;
    }
    public String hashcode(){
        return name+age+salary+maritalstatus.hashCode();

    }
}
