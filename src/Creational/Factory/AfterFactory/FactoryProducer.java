// FactoryProducer.java
package Creational.Factory.AfterFactory;

public class FactoryProducer {
    public static iPayment getFactory(TYPE choice) {
        switch (choice) {
            case ONLINE_PAYMENT:
                return new OnlinePayment();
            case UPI_PAYMENT:
                return new UPIPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}