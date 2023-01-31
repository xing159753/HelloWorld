package com.xing.homework.homework05;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);//1010 - 1 = 1009
//        checkingAccount.withdraw(10);//1009 - 9 = 1000 - 1 = 999
//        System.out.println(checkingAccount.getBalance());

        //测试SavingAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        //月初，定时器自动调用一下 earnMonthlyInterest
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());//1399 + 13.99
        savingsAccount.deposit(100);//免手续费
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());


    }
}
