package poo03.ex01.accounts;

import poo03.ex01.interfaces.GetBalance;
import poo03.ex01.interfaces.Withdraw;

public class Executive implements Withdraw, GetBalance {
    @Override
    public void getBalance() {
        System.out.println("Your balance is $ XX,yy");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("You're withdrawing $ " + amount);
    }

    @Override
    public void transactionNotOk() {
        System.out.println("Transaction failed, account type: Collector");
    }

    @Override
    public void transactionOk() {
        System.out.println("Transaction finished, account type: Collector");
    }
}
