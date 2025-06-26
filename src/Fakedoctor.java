public class Fakedoctor extends Doctor{
    String name;
    int id;
    String clinicname;
    Fakedoctor(String name,int id,String clinicname){
        this.name=name;
        this.id=id;
        this.clinicname=clinicname;
    }
    void imfakedoctor(){
        System.out.println("im fake doctor");
        System.out.println(name+id+clinicname);
    }
}
