package first;

import java.util.Scanner;

public class Task11 {
    public static void task11() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        String first = sc.nextLine();

        System.out.println("Введите второе число");
        int second = sc.nextInt();

        Double first2 = new Double(first);

        if (first2 > second) {
            System.out.println("Большее число " + first2 + "\nМеньшее число " + new Double(second));
        } else System.out.println("Большее число " + second + "\nМеньшее число " + first2);

    }
}

