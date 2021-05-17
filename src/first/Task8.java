package first;

import java.util.Scanner;

public class Task8 {
    public static void task8() {
        Scanner sc = new Scanner(System.in);
        double input;
        do {
            System.out.println("Введите целое положительное число");
            input = sc.nextDouble();
        }
        while ((input < 0) || (input % 1 != 0));

        long sum = 0;
        for (long i = 1; i < input; i++) {
            sum += i++;
            System.out.println(" sum = " + sum);
        }
        System.out.println("Итоговая сумма = " + sum);
    }
}
