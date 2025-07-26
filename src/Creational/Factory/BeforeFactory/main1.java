package Creational.Factory.BeforeFactory;

public class main1 {
    public static void main(String[] args) {
        String paymentType = "UPI"; // Change to "CreditCard" or "UPI"
        iPayment payment;
        iRefund refund;

        if ("CreditCard".equalsIgnoreCase(paymentType)) {
            payment = new CreditCardPayment();
            refund = new CreditCardRefund();
        } else if ("UPI".equalsIgnoreCase(paymentType)) {
            payment = new UPIPayment();
            refund = new UPIRefund();
        } else {
            System.out.println("Invalid payment type");
            return;
        }

        payment.pay();
        refund.refund();
    }
}