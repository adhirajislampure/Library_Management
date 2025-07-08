import java.util.List;
import java.util.Scanner;

public class StudentController {

    private List<Student> studentList;
    private StudentView view;
    private Scanner scanner;

    public StudentController(){
        this.studentList=new ArrayList<>();
        this.view=new StudentView();
        this.Scanner=new Scanner(System.in);
    }
    public void run(){
        boolean running=true;
        while(running){
            view.displayMenu();
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    viewStudentById();
                    break;
                case 4:
                    running=false;
                    view.displayMessage("Goodbye");
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent(){
        System.out.println("Enter student name");
        String name=scanner.nextLine();
        System.out.println("Enter student grade");
        String grade=scanner.nextLine();


        int id=studentList.size()+1;
        Student student=new Student(id,name,grade);
        studentList.add(student);
        view.displayMessage("Student added successfully");
    }

    private void viewAllStudents(){
        if(studentList.isEmpty()){
            view.displayMessage("No students found");
        }else{
            view.displayAllStudents(studentList);
        }
    }
    private void viewStudentById() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);

        if (student != null) {
            view.displayStudent(student);
        } else {
            view.displayMessage("Student not found.");
        }
    }
}
