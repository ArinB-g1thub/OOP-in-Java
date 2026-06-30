// Abstract class
abstract class Employee {
    protected int empId;
    protected String name;
    protected double salary;

    // Constructor
    Employee(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Abstract Method
    abstract void displayDetails();
}

// Interface
interface Bonus{
    void calculateBonus();
}

// Manager Class
class Manager extends Employee implements Bonus{
Manager(int empId, String name, double salary){
    super(empId, name, salary);
}

    // Implementing abstract method
    @Override
    void displayDetails(){
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : $" + salary);
    }

    // Implementing interface method
    @Override
    public void calculateBonus(){
        double bonus = salary * 0.02; // 20% bonus
        System.out.println("Bonus (20%) : $" + bonus);
    }
}


// Main class
public class EmployeeDemo{
    public static void main(String[] args){
        Manager manager = new Manager (101, "Arin", 5000);

        manager.displayDetails();
        manager.calculateBonus();
    }

}