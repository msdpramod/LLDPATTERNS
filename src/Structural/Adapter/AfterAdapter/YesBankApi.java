package Structural.Adapter.AfterAdapter;

public class YesBankApi {
    public void transferAmount(String sender, String receiver, double amount) {
        System.out.println("Transferring " + amount + " from " + sender + " to " + receiver + " using YesBank API.");
    }
}
