package HW1.task2;

public class Answer {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
       try {
           int[] c = new int[a.length];
           for (int i = 0; i < c.length; i++) {
               c[i] = a[i]-b[i];
           }
           return c;
       } catch (IndexOutOfBoundsException e) {
           System.out.println("Exception" + e.getMessage());
           return new int[1];
       }
    }
}
