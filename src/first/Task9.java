package first;

import java.util.Scanner;

public class Task9 {
    public static void task9() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int length = sc.nextInt();

        System.out.println("Введите элементы");
        double[] array = new double[length];
        double sum = 0;

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextDouble();
            sum += array[i];
        }
        System.out.println("Сумма элементов = "+ sum);

        double medium = sum / length;
        System.out.println("Среднее арифметическое = "+ medium);

        System.out.println("После модификации получился такой массив");
        for (double elem : array) {

            System.out.print(elem * medium + " ");
        }

    }
}
