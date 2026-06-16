// Parent class

class Person{
    String name;
    int age;

    //Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Method to display person details
    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class
class Student extends Person{
    int rollNo;

    //Constructor
    Student(String name, int age, int rollNo){
        super(name, age);
        this.rollNo = rollNo;
    }
    // Method to display student details
    void displayStudent(){
        displayPerson();
        System.out.println("Roll No: " + rollNo);
    }
}
// Main Class
public class SingleInheritanceDemo{
    public static void main (String[] args){
        Student s1 = new Student ("Arin", 19, 304);
        System.out.println("Student Details: ");
        s1.displayStudent();
    }
}