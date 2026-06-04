class Student{
    int id;
    String name;
    
    void insertRecord(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class TestStudent2 {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.insertRecord(id: 100, name:"Arin");
        s1.display();
    }
}