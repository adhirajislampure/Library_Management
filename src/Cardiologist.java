public class Cardiologist extends Doctor {
    String name;
    int id;
    String clinicname;

    Cardiologist(String name,int id,String clinicname){
        this.name=name;
        this.id=id;
        this.clinicname=clinicname;
    }
    void imcardolist(){
        System.out.println("im a fake cardiolist");
        System.out.println(name+id+clinicname);
    }
}
