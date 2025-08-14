package Challenges.challenge89;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class challenge94UnitChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();

        Set<Character> set = new HashSet<>();

        for( char c : str.toCharArray()){
            if(c == ' ') continue;
            set.add(c);
        }

        System.out.println(set);

        System.out.println(set.size());
    }
}
