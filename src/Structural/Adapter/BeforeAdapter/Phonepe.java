package Structural.Adapter.BeforeAdapter;

public class Phonepe {
    YesBankApi yesBankApi = new YesBankApi();
    public void pay(String from, String to , double amount) {
        yesBankApi.transferAmount(from,to,amount);
    }
}
