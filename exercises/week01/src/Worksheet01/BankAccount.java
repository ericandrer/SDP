package Worksheet01;

/**
 * Created by erodri07 on 10/01/2017.
 */
public class BankAccount {
    private float balance;
    public void deposit(float amount) {
        this.balance += amount;
    }
    public float showBalance() {
        return this.balance;
    }
    BankAccount() {
        balance = 100;
    }
}