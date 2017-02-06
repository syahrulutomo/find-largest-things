package com.sagecode.belajar.javainterface;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Measurable> accounts = new ArrayList<Measurable>();
        accounts.add(new BankAccount("Andi",0));
        accounts.add(new BankAccount("Sahal",10000));
        accounts.add(new BankAccount("Irman",2000));
        
       ArrayList<Measurable> country = new ArrayList<Measurable>();
        country.add(new Country("Indonesia",12500000));
        country.add(new Country("New Zealand",320000));
        country.add(new Country("Netherland",2100000));
        
        
        Measurable largestAccount = Data.max(accounts);
        BankAccount ba = (BankAccount) largestAccount;
        String largestName = ba.getName();
        double largestBalance = ba.getMeasure();
        System.out.println("**account with the largest balance**\n"+"account name: "+largestName+"\n balance: "+largestBalance+"\n\n");
        
        Measurable largestCountry = Data.max(country);
        Country co = (Country) largestCountry;
        String largestCountryName = co.getName();
        double largestArea = co.getMeasure();
        System.out.println("**country with the largest area**\n "+"country name: "+largestCountryName+"\n area: "+largestArea+"\n\n");
        
    
    }
}
