package com.lehigh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadContentsFromFile {

    String fileLocation = "";

    public void readFileMethod_1() throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileLocation)));
        System.out.println(data);
    }

    public void readFileMethod_2() throws IOException {
        File file = new File(fileLocation);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        br.readLine();
        br.readLine();
        System.out.println(br.readLine());
//        while ((st = br.readLine()) != null)
//            System.out.println(st);
    }

    public static void main(String[] args) throws IOException {
        ReadContentsFromFile rcff = new ReadContentsFromFile();
        rcff.fileLocation = "doc/filename.txt";
//        rcff.readFileMethod_1();
        rcff.readFileMethod_2();
    }
}
