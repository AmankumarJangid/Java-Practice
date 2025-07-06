package old.com.org;

import java.math.BigInteger;

public class BankAccount {

    private BigInteger accountNumber;
    private String accountHolderName;
    private long balance;

    public BankAccount(String accountNumber, String accountHolderName, long balance) {
        this.accountNumber = new BigInteger(accountNumber);
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getBalance() {
        return balance;
    }

    public void setAccountNumber(BigInteger accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void withdraw( long amount){
        if( balance < amount) {
            System.out.println("Insufficient Balance");
            System.out.printf("Current amount : %d\n" , balance);
        }
        else{
            balance-=amount;
            System.out.printf("Withdrawal amount %d\n" , amount);
            System.out.printf("Remaining amount %d\n" , balance);
        }
    }

    public void deposit( long amount ){
        balance += amount;
        System.out.printf("Amount deposited : %d\n" , amount);
        System.out.printf("Current amount : %d\n" , balance);
        System.out.println();
    }


}

