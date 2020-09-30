package com.Asd0cska;

public class Main {

    public static void main(String[] args) {

        BankAccount tomAccount = new BankAccount();
        BankAccount johnAccount = new BankAccount(1111, 0.00f, "John Doe", "valami@valami.vm", "+363030303");
        BankAccount bobAccount = new BankAccount(1112, 0.00f, "Bob Brown", "Bob@valami.vm", "+723030303");
        BankAccount timAccount = new BankAccount("Tim", "tim@email.com", "12345");

        System.out.println(johnAccount.getAccountNumber());
        System.out.println(johnAccount.getBalance());

        System.out.println(bobAccount.getAccountNumber());
        System.out.println(bobAccount.getBalance());

        System.out.println(tomAccount.getAccountNumber());
        System.out.println(tomAccount.getBalance());

        System.out.println(timAccount.getAccountNumber() + " name " + timAccount.getCustomerName());

//        johnAccount.withdraw(100.0f);
//
//        johnAccount.deposit(50.0f);
//        johnAccount.withdraw(100.0f);
//
//        johnAccount.deposit(51.0f);
//        johnAccount.withdraw(100.0f);

        VipCustomer vipCustomer = new VipCustomer();
        VipCustomer secondVipCustomer = new VipCustomer("polgár Jenő", Integer.MAX_VALUE);
        VipCustomer thirdVipCustomer = new VipCustomer("Peti" , Integer.MAX_VALUE, "peti@email.com");

        System.out.println(vipCustomer.getVipName() + " has " + vipCustomer.getCreditLimit() + " credit limit and his email address is " + vipCustomer.getVipEmail());
        System.out.println(secondVipCustomer.getVipName() + " has " + secondVipCustomer.getCreditLimit() + " credit limit and his email address is " + secondVipCustomer.getVipEmail());
        System.out.println(thirdVipCustomer.getVipName() + " has " + thirdVipCustomer.getCreditLimit() + " credit limit and his email address is " + thirdVipCustomer.getVipEmail());
    }
}
