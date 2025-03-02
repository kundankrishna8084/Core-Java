
package com.jspider.program.src.constructor.chaining;
public class BankAccount {
    String account_holder;
    double balance;
    BankAccount() {
        System.out.println("New Bank Account Created!");
    }
    BankAccount(String account_holder) {
        this();
        this.account_holder = account_holder;
    }
    BankAccount(String account_holder, double initialDeposit) {
        this(account_holder);
        this.balance = initialDeposit;
        System.out.println("Account Holder: " + account_holder + ", Balance: $" + balance);
    }
}
