 public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student("Jaya", 20, 1);
        Student s2 = new Student("krish", 22, 2);

        manager.addStudent(s1);
        manager.addStudent(s2);

        System.out.println("All Students: ");
        manager.showAllStudents();
    }
    }  
