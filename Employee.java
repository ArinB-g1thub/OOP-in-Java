class Person{
    String name;
    
    Person(){
        System.out.println("Default Constructor Called");
    }

    Person(String name){
        this.name = name;
        System.out.println("Name: "+ name);
    }
}

public class Employee extends Person{
    Employee(){
        super(); //from another class
        System.out.println("child default constructor");
    }
    Employee(String name){
        super(name);
    }
    void pass(){}
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Texas");
        e1.pass();
        e2.pass();
        }
}
