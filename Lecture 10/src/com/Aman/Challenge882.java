package com.Aman;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Challenge882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your file name : ");
        String fileName = sc.next();

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do{
                read = reader.read();

                System.out.print((char)read);
            }while( read != -1);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error Occured " + e.getMessage() + "\n at \n" + e.getStackTrace());
        }
    }
}
