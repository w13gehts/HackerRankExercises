package Exercises.StdinStdoutII;

import java.io.IOException;
import java.util.Scanner;

public class StdinStdoutII {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        String myString = scanner.next();
        scanner.close();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
