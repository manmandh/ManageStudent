import java.util.ArrayList;
import java.util.Scanner;
public class Handle {
    private ArrayList<Student> list;

    public Handle(){
        list = new ArrayList<Student>();
    }
    public void add(Student student){
        this.list.add(student);
    }

    public void addStudent(){
        for (int i=0; i<5; i++){
            System.out.println(String.format("Enter information (%d/%d)", i+1, 5));
            Student student = new Student();
            student.addStudent();
            if((findStudent(student.getId()) != null)){
                System.out.println("Student id already exist! Try again");
                addStudent();
            }
            this.add(student);
        }

    }
    public Student findStudent(int id){
        for (Student student : list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    public void outStudent(){
        System.out.println("Print all student:");
        for(Student student: list){
            student.outStudent();
            System.out.println("____");
        }
    }
    //Delete student
    public void destroyById() {
        System.out.println("ID?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for (Student student : list) {
            if (student.getId() == id) {
                list.remove(student);
            }
        }
        System.out.println("Destroyed");
    }

    //Find first name
    public void findByFirstName(String firstName) {
        for (Student student : list) {
            String fullName = student.getName();
            String str[] = fullName.split(" ");
            if (str[str.length - 1].equals(firstName))
                student.outStudent();
        }
    }

    //Print highest point
    public void Max(){
        System.out.println("Print Employee has the highest salary: ");
        double max = 0.0;
        for (Student student: list){
            if(student.Point()>max)
                max = student.Point();
        }
        for (Student student: list){
            if(max ==  student.Point());
                student.outStudent();
        }

    }

}
