package first;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void task14() {
        Random random = new Random();
        int[] array = new int[15];
        int max = -20;
        int min = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = 20 - random.nextInt(41);
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }

            System.out.print(array[i] + " ");
        }
        System.out.println("\nМаксимальное значение = " + max + ". Минимальное значение = " + min + ".");

        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Максимальное значение по модулю = " + max);

        } else System.out.println("Максимальное значение по модулю = " + min);
    }
}
