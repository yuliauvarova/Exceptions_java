package HW2.task2;

public class Division {
    public static double divide(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor ==0) {
            throw new DivisionByZeroException("Division by zero is forbidden");
        }
        return (double) dividend/divisor;
    }
}
