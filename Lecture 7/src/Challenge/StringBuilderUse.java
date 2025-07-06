package Challenge;

import java.util.Scanner;

public class StringBuilderUse {

    public static void main(String[] args) {
        String[] str = { "My" , "name" , "is" ,"Aman" ,"Jangid"};
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");
        }

        System.out.println(sb);

        StringBuilder test = new StringBuilder();
        test.append( new Scanner(System.in).next());
        System.out.println(test);
    }
}
