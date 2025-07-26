package Creational.Factory.AfterFactory;

public class UPIPayment implements  iPayment {
    @Override
    public void payment(double amount) {
        System.out.println("UPI Payment"+amount);
    }
}
