package com.Asd0cska;

public class BankAccount {

    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(float depositAmount){
        this.balance += depositAmount;
        System.out.println("You deposit successfully " + depositAmount + " and your current balance is " + this.balance);
    }

    public void withdraw(float withdrawAmount){
        if (this.balance - withdrawAmount < 0){
            System.out.println("Insufficient funds, you have got only " + withdrawAmount);
        }else{
            this.balance -= withdrawAmount;
            System.out.println("You withdraw successfully " + withdrawAmount + " and your current balance is " + this.balance);
        }
    }

    public BankAccount(){
        this(56789, 2.50f, "Default name", "Default Address", "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, float balance, String customerName, String email, String phoneNumber) {

        System.out.println("BankAccount constructor called");

        setAccountNumber(accountNumber);
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55f, customerName, email, phoneNumber);
    }
}
