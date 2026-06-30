// Interface
interface Payment{
    void pay (double amount);
}

// Credit Card Payment Class
class CreditCardPayment implements Payment{

    @Override
    public void pay (double amount){
        System.out.println("Payment of Rs. " + amount + " made using Credit Card.");
    }
}

// UPI Payment class
class UPIPayment implements Payment{

@Override
public void pay(double amount){
    System.out.println("Payment of Rs. " + amount + " made using UPI.");
}
}

// Main Class
public class PaymentDemo{

    public static void main(String[] args){
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();

        payment1.pay(5000);
        payment2.pay(2500);
    }
}