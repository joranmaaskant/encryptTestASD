package asd.lab.encrypted;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NonEcryptTest {
     NonEcryptTest(String originalString, File file) throws IOException {
         long endTime;
         long startTime;
         startTime = System.currentTimeMillis();
         writeFile(originalString,file);
         endTime = System.currentTimeMillis();
         System.out.println("Write Total execution time: " + (endTime-startTime) + "ms");
         startTime = System.currentTimeMillis();
         readFile(file);
         endTime = System.currentTimeMillis();
         System.out.println("Read Total execution time: " + (endTime-startTime) + "ms");

    }

    private void writeFile(String originalString, File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(originalString);
        writer.close();
    }
    private void readFile(File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        String originalString = reader.nextLine();
    }
}
