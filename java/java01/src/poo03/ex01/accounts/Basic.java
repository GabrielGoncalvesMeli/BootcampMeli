package poo03.ex01.accounts;

import poo03.ex01.interfaces.Deposit;
import poo03.ex01.interfaces.Transfer;

public class Basic implements Deposit, Transfer {
    @Override
    public void deposit(double amount) {
        System.out.println("You are doing a deposit of $ " + amount);
    }

    @Override
    public void transactionNotOk() {
        System.out.println("Transaction failed");
    }

    @Override
    public void transactionOk() {
        System.out.println("Transaction finished");
    }

    @Override
    public void transfer(double amount) {

    }
}
