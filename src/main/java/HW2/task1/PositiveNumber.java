package HW2.task1;

import java.util.Scanner;

public class PositiveNumber {

    public static boolean isPositivNumber(int num) throws InvalidNumberException{
        if (num<=0){
            throw new InvalidNumberException("Число не корректно");
        }
        return true;
    }

    public static void main(String[] args) throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите num: ");
        int num = scanner.nextInt();

        try{
            boolean res = isPositivNumber(num);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e){
            System.out.println("Исключение: " + e.getMessage());
        }

    }
}
