package first;

import java.util.Scanner;


public class Fin3 {
    public static void fin3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int count = sc.nextInt();
        sc.nextLine();

        char symbol;
        String max_string = "";
        int max_length = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Введите строку");

            String line = sc.nextLine();

            StringBuilder new_line = new StringBuilder();

            for (int j = 0; j < line.length(); j++) {
                symbol = line.charAt(j);
                if (new_line.indexOf("" + symbol) < 0) {
                    new_line.append(symbol);
                }
            }
            if (new_line.length() > max_length){
                max_length = new_line.length();
                max_string = line;
            }

            System.out.println("количество разных: " + new_line + " " + new_line.length());
        }

        System.out.println("Самая разнообразная строка: " + max_string);

    }
}
