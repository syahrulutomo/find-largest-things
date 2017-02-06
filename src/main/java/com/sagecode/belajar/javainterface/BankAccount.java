package com.sagecode.belajar.javainterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Describe a BankAccount with its balance
 */
public class BankAccount implements Measurable{
    
    private double balance;
    private String accountName;
    
    /**
     * Construct a BankAccount from a balance
     * @param aBalance the BankAccount balance
     * @param aName the BankAccount name
     */
    
    public BankAccount(String aName,double aBalance)
    {
        accountName = aName;
        balance = aBalance;
    }
    
    /**
     * Get the measured BankAccount's balance
     * @return balance of the BankAccount
     */
    public double getMeasure()
    {
        return balance;
    }

    /**
     * Get the measured BankAccount's name
     * @return name of the BankAccount
     */
    public String getName() 
    {
        return accountName;
    }
}
