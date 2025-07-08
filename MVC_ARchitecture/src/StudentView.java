import java.util.List;

public class StudentView {
    public void displayMenu(){
        System.out.println("\n=== Student Management System ===");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. View Student by ID");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    public void displayStudent(Student student){
        System.out.println("/n student details");
        System.out.println("Id"+student.getId());
        System.out.println("Name"+student.getName());
        System.out.println("Email"+student.getGrade());
    }

    public void displayAllStudents(List<Student> students){
        System.out.println("nAll students");

        for(Student student:students){
            System.out.println("Id"+student.getId());
            System.out.println("Name"+student.getName());
            System.out.println("Email"+student.getGrade());
        }

    }
    public void displayMessage(String message){
        System.out.println("/n"+message);
    }
}
