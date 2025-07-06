import java.util.Scanner;
//password checker using do-while loop
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to set your password");
        String password;
        do{
            System.out.println("Please enter your password:");
            password = input.next();
        }while( !isValidPassword(password));

        System.out.println("Thanks for entering a valid password");
    }



    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
