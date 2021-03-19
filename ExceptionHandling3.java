// package example3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling3 {

    public static void main(String[] args) {

        try {
            read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found"); // Make this message more specific
        }

    }

    public static void read() throws FileNotFoundException {

        File file = new File("example.txt");

        Scanner readFile = new Scanner(file);

    }

}
