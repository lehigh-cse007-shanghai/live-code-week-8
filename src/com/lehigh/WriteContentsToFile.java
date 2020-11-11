package com.lehigh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContentsToFile {

    String fileLocation = "";

    public void writeMethod_1() throws IOException {
        FileWriter myWriter = new FileWriter(fileLocation);
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    }

    public void writeMethod_2() throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation));
        writer.write(str);
        writer.close();
    }

    public void writeMethod_3() throws IOException {
        String str = "World";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation, true));
        writer.append(' ');
        writer.append(str);

        writer.close();
    }

    public static void main(String[] args) throws IOException {
        WriteContentsToFile wctf = new WriteContentsToFile();
        wctf.fileLocation = "filename1.txt";
//        wctf.writeMethod_1();
//        wctf.writeMethod_1();
//        wctf.writeMethod_1();
//        wctf.fileLocation = "filename2.txt";
//        wctf.writeMethod_2();
//        wctf.writeMethod_2();
//        wctf.writeMethod_2();
        wctf.fileLocation = "filename2.txt";
        wctf.writeMethod_3();
        wctf.writeMethod_3();
        wctf.writeMethod_3();
    }

}
