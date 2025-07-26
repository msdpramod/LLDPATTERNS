package Creational.Factory.BeforeFactory;

public class UPIRefund implements iRefund {
    @Override
    public void refund() {
        System.out.println("Refund done using UPI");
    }
}
