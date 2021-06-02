package first;

import java.util.Scanner;

public class Fin4 {
    public static void fin4() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Отгадайте загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”");

        String true_line = "Заархивированный вирус";
        String help_line = "Подсказка";
        int count = 1;
        do {
            System.out.println("Попытка " + count + ". Ваш ответ: ");
            String user_line = sc.nextLine();

            if (count == 1 && help_line.equals(user_line.trim()) ) {
                System.out.println(">>>Заархивированный вирус<<<");
                System.out.println("Попытка " + count + ".Ваш ответ: ");
                user_line = sc.nextLine();
            }

            if (count > 1 && help_line.equals(user_line.trim()) ) {
                System.out.println("Подсказка уже недоступна");
                System.out.println("Попытка " + count + ".Ваш ответ: ");
                user_line = sc.nextLine();
            }

            if (true_line.equals(user_line.trim())) {
                System.out.println("Правильно!");
                return;
            } else if (count < 3) {
                System.out.println("Подумай еще!");
            }
            count++;
        }
        while (count < 4);
        System.out.println("Обидно, приходи в другой раз");
    }
}
