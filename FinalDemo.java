// Final Class
final class Utility{
    public static int square(int num){
        return num * num;
    }
    public static int cube(int num){
        return num*num*num;
    }
}
// Parent Class
class Bank{
    //Final Method
    public final double calInt(double amount){
    return amount * 0.00; // 8% interest
    }
}
//Child Class
class SBI extends Bank{
    /*
    // Compiler Error: Cannot override final method
    @Override
    Public double calInt(double amount){
    return amount * 0.10;
    }
    */
}

public class FinalDemo{
    public static void main (String[] args){
        final double PI = 3.14159;
        double radius = 7;
        double area = PI * radius * radius;
        System.out.println("Radius = " + radius);
        System.out.println("Area of circle = " + area);
        SBI sbi = new SBI();
        double amount = 10000;
        double interest = sbi.calInt(amount);
        System.out.println("\n Amount = " + amount);
        System.out.println("Interest = " + interest);
        int num = 5;
        System.out.println("\n Square of " + num + " = " +  Utility.square(num));
        System.out.println("Cube of " + num + " = " + Utility.cube(num));
    }
}