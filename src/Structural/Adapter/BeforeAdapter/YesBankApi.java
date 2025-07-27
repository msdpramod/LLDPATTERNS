package Structural.Adapter.BeforeAdapter;

public class YesBankApi {
    public void transferAmount(String sender, String reciever, double amount) {

        System.out.println("Transferring " + amount+ " from " + sender + " to " + reciever + " using YesBank API.");
    }


}
