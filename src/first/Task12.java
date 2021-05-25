package first;

import java.util.Scanner;

public class Task12 {

    public static void task12(String parameter) {

        System.out.println("Проверить, содержит ли строка подстроку “Java”");
        boolean result_1 = parameter.contains("Java");
        System.out.println(result_1);

        System.out.println("Проверить, начинается ли строка с подстроки “I like”");
        boolean result_2 = parameter.startsWith("I like");
        System.out.println(result_2);

        System.out.println("Проверить, заканчивается ли строка с подставки “!!!”");
        boolean result_3 = parameter.endsWith("!!!");
        System.out.println(result_3);

        System.out.println("Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.");
        if (result_1 && result_2 && result_3) {
            System.out.println(parameter.toUpperCase());
        }

        String result_4 = parameter.replace("a", "o");
        System.out.println("Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран");
        System.out.println(result_4);

        String result_5 = result_4.substring(7, 11);

        System.out.println(result_5);

    }
}
