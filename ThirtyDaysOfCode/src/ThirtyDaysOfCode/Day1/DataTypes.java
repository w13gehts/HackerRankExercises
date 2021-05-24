package ThirtyDaysOfCode.Day1;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String s2 = scan.next() + scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        int sum = i + i2;
        double sumd = d + d2;
        String con = s.concat(s2);

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(sum);
        /* Print the sum of the double variables on a new line. */
        System.out.println(sumd);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(con);

        scan.close();
}}
