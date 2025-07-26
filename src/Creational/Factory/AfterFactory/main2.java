// File: src/Creational/Factory/AfterFactory/main2.java
package Creational.Factory.AfterFactory;

public class main2 {
    public static void main(String[] args) {
       iPayment upiPayment = FactoryProducer.getFactory(TYPE.UPI_PAYMENT);
       upiPayment.payment(1000.0);

         iPayment onlinePayment = FactoryProducer.getFactory(TYPE.ONLINE_PAYMENT);
         onlinePayment.payment(2000.0);
    }
}