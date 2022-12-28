package com.xing.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack666666");
        account.setBalance(10);
        account.setPwd("12345666666");
        account.showInfo();
    }
}
