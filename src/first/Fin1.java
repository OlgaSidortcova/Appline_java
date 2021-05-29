package first;

import java.util.Scanner;

public class Fin1 {
    public static void fin1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите курс доллара");
        double rate = sc.nextDouble();

        System.out.println("Введите количество рублей для конвертации");
        double count = sc.nextDouble();

        System.out.printf("Итого %.2f рублей", count / rate );

    }
}
