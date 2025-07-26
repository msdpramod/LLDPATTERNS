package Creational.Factory.AfterFactory;

public class OnlinePayment implements  iPayment {
    @Override
    public void payment(double amount) {
        System.out.println("Online Payment"+amount);
    }

}
