 public class Student {
    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void displayInfo(){
        System.out.println("Id: " + id + ", Name: " + name + ", Age: " + age);
    }
 }
 

