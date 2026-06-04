class Student{
    int id;
    String name;
    //constructor
    Student(int id, String name){
        System.out.println("ID: "+id + "  " + "Name: "+ name);
    } void pass(){}
}
public class ObjectConstructor{
    public static void main(String[] args){
        Student s1 = new Student(100,"Texas");
        s1.pass();
    }
}