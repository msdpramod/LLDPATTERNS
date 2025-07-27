package Structural.Adapter.AfterAdapter;

import Structural.Adapter.BeforeAdapter.YesBankApi;

public class YesBankAdapter implements BankAdapter {
    YesBankApi yesBankApi = new  YesBankApi();
    @Override
    public void pay(String from, String to, double amount) {
        yesBankApi.transferAmount(from, to, amount);
    }
}
