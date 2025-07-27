package Structural.Adapter.AfterAdapter;

public class main2 {
    public static void main(String[] args) {
        BankAdapter hdfcAdapter = new HDFCAdapter();
        BankAdapter yesBankAdapter = new YesBankAdapter();

        hdfcAdapter.pay("Alice", "Bob", 1000.0);
        yesBankAdapter.pay("Charlie", "David", 2000.0);
        hdfcAdapter.pay("Eve", "Frank", 1500.0);
        yesBankAdapter.pay("Grace", "Heidi", 2500.0);

    }
}
