package Creational.Factory.AbstractFactory;

public class Icci implements BankFactory{
    @Override
    public iService createPayment(String paymentType) {
        switch (paymentType) {
            case "Paytm":
                return new Paytm();
            case "PhonePe":
                return new PhonePe();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
    }
    @Override
    public iService createRefund(String refundType) {
        switch (refundType) {
            case "Paytm":
                return new Paytm();
            case "PhonePe":
                return new PhonePe();
            default:
                throw new IllegalArgumentException("Unknown refund type: " + refundType);
        }
    }
}
