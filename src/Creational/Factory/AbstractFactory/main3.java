package Creational.Factory.AbstractFactory;

public class main3 {
    public static void main(String[] args) {
        BankFactory Hdfc=  new HDFC();
        iService payment = Hdfc.createPayment("Paytm");
        payment.pay();
        iService refund1 = Hdfc.createRefund("PhonePe");
        refund1.refund();

        BankFactory Icci = new Icci();
        iService payment2 = Icci.createPayment("PhonePe");
        payment2.pay();

        iService refund2 = Icci.createRefund("Paytm");
        refund2.refund();

    }
}
