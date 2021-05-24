package ThirtyDaysOfCode.Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
    /*
     * Complete the 'solve' function below. The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tax_percent) / 100;

        int totalCost = (int) Math.round(meal_cost + tip + tax);
        System.out.println(totalCost);
    }
}