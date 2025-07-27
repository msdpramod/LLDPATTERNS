package Structural.Adapter.BeforeAdapter;

public class main1 {
    public static void main(String[] args) {
        Phonepe phonepe = new Phonepe();
        phonepe.pay("A", "B", 1000.0);

        // The following line would not work as YesBankApi is not compatible with Phonepe
        // YesBankApi yesBankApi = new YesBankApi();
        // yesBankApi.transferAmount("A", "B", 1000.0);

        // To use YesBankApi directly, we would need to create an adapter for it.
    }
}
