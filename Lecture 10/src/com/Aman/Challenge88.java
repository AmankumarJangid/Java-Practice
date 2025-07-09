package com.Aman;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Challenge88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your file name : ");
        String filename = input.next();

        try(FileReader reader = new FileReader(filename)){

            int read = 0;
            while( (read = reader.read()) != -1){
                System.out.print((char)read);
            }
//            do{
//                read = reader.read();
//                System.out.print((char)read);
//            }while( read != -1);

        }
        catch( FileNotFoundException e){
            System.out.printf("File \"%s\" not Found : %s\n" ,filename ,  e.getMessage());
        }
        catch( IOException e){
            System.out.printf("Exception Occured : %s\n" , e.getMessage());
        }
    }
}
