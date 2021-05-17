package first;

import java.util.Scanner;

public class Task7 {
    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int y = 0;
        int z = 100;
        System.out.println("Константы: x = " + x + "; y = " + y + "; z = " + z);

        System.out.println("Введите размер массива");
        int length = sc.nextInt();
        System.out.println("Введите элементы");
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Получился такой массив");
        for (int elem : array) {
            System.out.print(elem + " ");
        }

        for (int elem : array) {

            if ((elem == x) || (elem == y) || (elem == z)) {
                System.out.println("\n" + "Данное значение имеется в константах: " + elem);
                return;
            }
        }
            System.out.println("\n" + "Констант нет в массиве");
    }
}
