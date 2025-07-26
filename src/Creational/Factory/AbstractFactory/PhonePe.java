package Creational.Factory.AbstractFactory;

public class PhonePe implements iService {
    @Override
    public void pay() {
        System.out.println("Payment done using PhonePe");
    }
    @Override
    public void refund() {
        System.out.println("Refund initiated using PhonePe");
    }
}
