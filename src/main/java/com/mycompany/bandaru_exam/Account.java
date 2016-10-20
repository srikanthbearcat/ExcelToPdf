/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bandaru_exam;

/**
 *
 * @author S525796
 */
public class Account {

    private String firstName;
    private String lastName;
    private String accNumber;
    private Double balance;

    public Account(String firstName, String lastName, String accNumber, Double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public Account() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
