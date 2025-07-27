package Structural.Adapter.AfterAdapter;

public class HDFCAdapter implements  BankAdapter {
    HDFCBankApi hdfcApi = new HDFCBankApi();

    @Override
    public void pay(String from, String to, double amount) {
        hdfcApi.CreditAmount(from, to, amount);
    }

}
