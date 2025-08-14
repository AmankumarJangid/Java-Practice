package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {


    public static void main(String[] args) {
        // Checked exception is must be handled
        /// FileWriter writer = new FileWriter(filename); // This is checked exception example which must be handled by us
        //// It throws an IOException


        String filename = "MyJavaCourseTest.txt";
//        FileWriter writer;
        try (FileWriter  writer = new FileWriter(filename)){  // Try with resources
           // it stores the file the default outside of the project
            for( int i = 0 ; i < 10 ; i++)// in example img we used try with resources
                writer.write("Hello this is a special program to handle files\n");


            writer.flush();
            System.out.println("File Written Successfully");
        }
        catch(IOException e){
            System.out.printf("Exception occured : %s\n" ,e.getMessage());
        }
///        finally{
///            writer.close(); // this is not declared if we declared the writer in the try block
///            // so we ues try with resource ( try( resource)
///            // so the closing will be handled automatically by try with resource
///       }
    }

}
