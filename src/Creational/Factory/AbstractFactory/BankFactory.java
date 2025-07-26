package Creational.Factory.AbstractFactory;

public interface BankFactory {
    iService createPayment(String paymentType);
    iService createRefund(String refundType);
}
