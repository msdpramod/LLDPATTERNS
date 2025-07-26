package Creational.Factory.BeforeFactory;

public class CreditCardPayment implements  iPayment {
    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
