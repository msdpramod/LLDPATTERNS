package Creational.Factory.AbstractFactory;

public class Paytm implements iService {
    @Override
    public void pay() {
        System.out.println("Payment done using Paytm");
    }
    @Override
    public void refund() {
        System.out.println("Refund initiated using Paytm");
    }
}
