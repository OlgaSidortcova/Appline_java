package first;

import java.util.Scanner;

public class Task4 {
    public static void task4() {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();
        System.out.println("Получились числа " + x + " " + y + " " + z);

        float med = (x + y + z) / 3;
        System.out.println("Среднее арифметическое " + med);
        double b = Math.floor(med / 2);
        if (b > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
