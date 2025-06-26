public class FAKEDOCTOR2 extends DOCTOR2{
    String degree;
    FAKEDOCTOR2(String name, String licenceno, String clinicname,String degree){
        this.degree=degree;
        super.clinicname=clinicname;
        super.licenceno=licenceno;
        super.name=name;
    }
    public void detailseyedoctor(){
        System.out.println("name of eyedoctor"+name);
        System.out.println("licence no"+licenceno);
        System.out.println("name of clinic"+clinicname);
        System.out.println("degree = "+degree);
    }
}
