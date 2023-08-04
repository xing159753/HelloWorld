package com.itheima.dao;

import java.sql.SQLException;

import com.itheima.domain.Account;

public interface IAccountDAO {

    public void addAccount(Account account) throws SQLException;

    public Account findByCustomer(int id) throws Exception;

    public void updateAccount(double balance, int id) throws Exception;
}