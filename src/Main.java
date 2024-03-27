import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = new int[15];
        for (int i = 0; i < 15; i++) {
            c[i] = i * 2;
        }
        //task2
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        //task3
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //task4
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) a[i] = a[i] + 1;
        }
        System.out.println(Arrays.toString(a));
    }

}