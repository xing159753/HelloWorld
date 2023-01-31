package com.xing.homework.homework05;

public class CheckingAccount extends BankAccount {//新的账号
    //属性
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款
        super.deposit(amount - 1);//巧妙的使用了父类的 deposit
        //1 块钱入银行账号
    }
    @Override
    public void withdraw(double amount) {//取款
        super.withdraw(amount + 1);
        //一块钱转入银行账号
    }
}
