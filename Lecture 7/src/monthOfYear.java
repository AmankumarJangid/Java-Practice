import java.util.Scanner;

public class monthOfYear {
    public static void main(String[] args) {
        monthOfYear object = new monthOfYear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of month you want : ");
        int month = sc.nextInt();
        System.out.println("The month is " + object.month(month)); // non-static member can't be called by static member function

    }
    public String month(int monthNumber){

        return switch( monthNumber){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
    }
}
