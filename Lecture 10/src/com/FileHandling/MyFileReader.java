package com.FileHandling;

import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {
        String filename = "MyJavaCourseTest.txt";

        try (FileReader reader = new FileReader(filename)){
            int read  = 0;
            do {
                read = reader.read(); // reac() reads the chareacter in the form of Integer
                if( read == -1) break;
                System.out.print((char)read);
            }while( read != -1); // when doing read != -1 it should be integer not an character before so we read it as integer first then print it as a character
        }
        catch(IOException e ){
            System.out.printf("Exception Occured : %s", e.getMessage());
        }
    }
}
