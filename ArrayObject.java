class Student{
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + id);
    }
}
public class ArrayObject{
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Arin", 123);
        students[1] = new Student("Swors", 456);
        students[2] = new Student("Bijesh", 789);
        students[0].display();
        for(int i = 0; i < students.length; i++){
             students[i].display();
             System.out.println();
        }
    }
}