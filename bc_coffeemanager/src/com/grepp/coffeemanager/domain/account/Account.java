package com.grepp.coffeemanager.domain.account;

public class Account {

    private int balance;
    private int sales;
    private int expenses;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getSales() {
        return sales;
    }

    public int getExpenses() {
        return expenses;
    }

    public boolean registExpenses(int expenses) {
        if(balance < expenses) return false;
        balance -= expenses;
        this.expenses += expenses;
        return true;
    }

    public void registSales(int paymentPrice) {
        balance += paymentPrice;
        sales += paymentPrice;
    }
}
