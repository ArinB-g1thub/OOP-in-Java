// Calcuator Class
class Calculator{

    // Method to add 2 integers
    int add(int a, int b){
        return a+b;
    }

    // Method to add 3 integers
    int add(int a, int b, int c){
        return a + b + c;
    }

    // Method to add 2 doubles
    double add (double a, double b){
        return a + b;
    }
}

// Main Class
public class CalculatorDemo{
    public static void main (String[] args){

        Calculator calc = new Calculator();
        
        // Calling overloaded methods
        System.out.println("Addition of 2 integers: " + calc.add(10,20));

        System.out.println("Addition of 3 integers: " + calc.add(10,20, 30));

        System.out.println("Addition of 2 doubles: " + calc.add(10.5, 20.8));
    }
}