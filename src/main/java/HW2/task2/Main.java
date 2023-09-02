package HW2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что делим?  ");
        int dividend = scanner.nextInt();

        System.out.println("На что делим?  ");
        int divisor = scanner.nextInt();

        try {
            double result = Division.divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
