package first;

import java.util.Scanner;

public class Task5 {
    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println("Введите знак операции ");
        char c = sc.next().charAt(0);

        System.out.print("Получились " + x + " " + c + " " + y + " = ");

        switch (c) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
        }
    }
}