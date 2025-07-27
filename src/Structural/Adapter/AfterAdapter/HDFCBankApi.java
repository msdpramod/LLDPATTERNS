package Structural.Adapter.AfterAdapter;

public class HDFCBankApi {
    public void CreditAmount(String sender, String receiver, double amount) {
        System.out.println("Credited " + amount + " from " + sender + " to " + receiver + " using HDFC Bank API.");
    }
}
