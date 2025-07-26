package Creational.Factory.BeforeFactory;

public class UPIPayment implements iPayment {
    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }

}
