package com.xing.jdbc.a1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoService {
    private static final String url = "jdbc:sqlite:resources/MYSTERY_BUSINESS.db";

    /*
    Method to test the drivers are found in the classpath
     */
    public static void loadDriver() {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("The driver was successfully loaded.");
            Thread.sleep(1000);
        } catch (ClassNotFoundException | InterruptedException e) {
            System.out.println("The driver class was not found in the program files at runtime.");
            System.out.println(e);
            System.exit(1);
        }
    }

    /*
    Method to test the connection to the database
     */
    public static void testDatabaseConnection() {
        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println("The connection to the SQLite database was successful!");
            Thread.sleep(1000);
        } catch (SQLException | InterruptedException e) {
            System.out.println("The connection to the database was unsuccessful!");
            System.out.println(e);
        }
    }

    /*
    Method to reset the database
     */
    public static void resetDatabase() {
        try (
                Connection connection = DriverManager.getConnection(url);
                Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate("DROP TABLE CUSTOMERS");
            System.out.println("The database has been reset!!");
            Thread.sleep(1000);
        } catch (SQLException | InterruptedException e) {
            System.out.println("The database was not reset.");
            System.out.println(e);
        }
    }

    /*
    Method to create the CUSTOMER table in the database
     */
    public static void createTable() {
        String createTableStatement = "CREATE TABLE CUSTOMERS ("
                + "CUST_ID INTEGER PRIMARY KEY,"
                + "CUST_F_NAME TEXT NOT NULL,"
                + "CUST_L_NAME TEXT NOT NULL,"
                + "CUST_EMAIL TEXT NOT NULL,"
                + "CUST_CELL_NUM TEXT NOT NULL"
                + ");";

        try (
                Connection connection = DriverManager.getConnection(url);
                Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate(createTableStatement);
            System.out.println("The CUSTOMER table has been created.");
            Thread.sleep(1000);
        } catch (SQLException | InterruptedException e) {
            System.out.println("There was an error with your request.");
            System.out.println(e);
        }
    }

    /*
    Method to save a list of customers to the CUSTOMER table
     */
    public static void saveCustomers(List<Customer> customers) {
        try (
                Connection connection = DriverManager.getConnection(url);
                Statement statement = connection.createStatement();
        ) {
            for (Customer customer : customers) {
                String insertIntoCustomer = "INSERT INTO CUSTOMERS VALUES ("
                        + "CAST('" + customer.ID + "' AS INTEGER),\""
                        + customer.firstName + "\",\""
                        + customer.lastName + "\",\""
                        + customer.email + "\",\""
                        + customer.cellNumber
                        + "\");";
                statement.executeUpdate(insertIntoCustomer);
            }
            System.out.println("The customers have been saved to the CUSTOMER table.");
            Thread.sleep(1000);
        } catch (SQLException | InterruptedException e) {
            System.out.println("There was an error with your request.");
            System.out.println(e);
        }
    }

    /*
    Method to load all customers from the CUSTOMER table
     */
    public static List<Customer> loadAllCustomers() {
        List<Customer> allCustomers = new ArrayList<>();
        System.out.println("Trying to load all customers from the database...\n");

        try (
                Connection connection = DriverManager.getConnection(url);
                Statement statement = connection.createStatement();
                ResultSet results = statement.executeQuery("SELECT * FROM CUSTOMERS;")
        ) {
            Thread.sleep(1000);
            while (results.next()) {
                // Save customer variables here:
                int ID = results.getInt(1);
                String firstName = results.getString(2);
                String lastName = results.getString(3);
                String email = results.getString(4);
                String cellNumber = results.getString(5);
                // Add a new customer to allCustomers here:
                allCustomers.add(new Customer(ID, firstName, lastName, email, cellNumber));
            }
            System.out.println("All customers were loaded from the database.");
        } catch (SQLException | InterruptedException e) {
            System.out.println("There was an error with your request.");
            System.out.println(e);
        }

        return allCustomers;
    }
}

