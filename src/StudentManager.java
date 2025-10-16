import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student>students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }
    public void showAllStudents(){
        for(Student s : students) {
        s.displayInfo();
    }
    }
}
