class Student{
    String name;
    int id;

    Student(String name){
        System.out.println("Student name: " + name);
    }

    Student(int id){
        System.out.println("Student ID: " + id);
    }

    Student(String name, int id){
        System.out.println("Student name: " + name + "Student ID: " + id);
    }   
}

public class ConstructorOverloading{
    public static void main(String[] args) {
        Student s1 = new Student(123);
        Student s2 = new Student("123abc");
        Student s = new Student("Texas");
        Student s3 = new Student("Texas", 67);
    }
}