package HW1.task3;

public class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        try{
            int[] c = new int[a.length];
            for (int i = 0; i < c.length; i++) {
                c[i]=a[i]/b[i];
            }
            return c;
        } catch(RuntimeException e){
            int[] c = new int[1];
            return c;
        }

    }
}
