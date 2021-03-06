package com.tolache.mavensample;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String defaultBaseDir = System.getProperty("java.io.tmpdir");
        System.out.println("tmpdir is: " + defaultBaseDir);
        try {
            File myObj = new File(defaultBaseDir + "new_file.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + defaultBaseDir + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
