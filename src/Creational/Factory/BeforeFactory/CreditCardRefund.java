package Creational.Factory.BeforeFactory;

public class CreditCardRefund implements iRefund {
    @Override
    public void refund() {
        System.out.println("Refund done using Credit Card");
    }
}
