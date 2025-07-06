package com.example.utils;

import java.math.BigInteger;
import java.util.Scanner;

public class BankAccount {
//    private BigInteger accountNumber;
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public BankAccount( String accountHolder , String accountNumber){
        this.accountHolder = accountHolder.toUpperCase();
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }
    public void deposit(double amount){
        this.balance +=  amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public double withdraw(double amount){
        try{
            if( this.balance - amount < 0.00){
                throw new IllegalArgumentException(String.format("Message : Current amount : %f unable to withdraw more thanexisting amount : %f", this.balance, amount ));
            }
            this.balance -= amount;
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return this.balance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount acc1 = new BankAccount("Aman Kumar" , "25550100031402");

        System.out.printf("Acc Holder : %s , Acc Number : %s\n", acc1.getAccountHolder(), acc1.getAccountNumber());

        System.out.println("Enter the amount to deposit");
        acc1.deposit(input.nextDouble());

        System.out.printf("The amount in acc : %s , is %.2f\n", acc1.getAccountNumber(), acc1.getBalance());

        System.out.println("Enter The amount to withdraw");
        double amount = input.nextDouble();
        double balance = acc1.withdraw(amount);
        amount = balance< amount? 0 : amount;

        System.out.printf( "The amount : %.2f remaining, withdrawed amount : %.2f ", balance, amount);

    }

}
