package old.com.org;


public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456781234","Aman Kumar", 500);
        System.out.println("Balance : " + acc1.getBalance());
        acc1.withdraw(4000);
        acc1.deposit(7000);
        acc1.withdraw( 4000);
    }
}
