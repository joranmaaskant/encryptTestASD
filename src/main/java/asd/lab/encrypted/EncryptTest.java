package asd.lab.encrypted;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EncryptTest {
     String secretKey = "ssshhhhhhhhhhh!!!!";
    private long startTime;

    EncryptTest(String originalString, File file ) throws IOException {
    long endTime;
    long startTime;
    startTime = System.currentTimeMillis();
    writeFile(originalString,file);
    endTime = System.currentTimeMillis();
    System.out.println("Encrypt Total execution time: " + (endTime-startTime) + "ms");
    startTime = System.currentTimeMillis();
    readFile(file);
    endTime = System.currentTimeMillis();
    System.out.println("Decrypt Total execution time: " + (endTime-startTime) + "ms");
}
    public  void writeFile(String originalString, File file) throws IOException {
        String encryptedString = AES.encrypt(originalString, secretKey) ;
        FileWriter writer = new FileWriter(file);
        writer.write(encryptedString);
        writer.close();
    }
    public  void readFile(File file) throws IOException {
        Scanner reader = new Scanner(file);
        String encryptedString = reader.nextLine();
        String originalString = AES.decrypt(encryptedString,secretKey);
    }
}
