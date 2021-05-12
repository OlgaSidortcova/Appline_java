package first;

import java.util.Scanner;

public class Task6 {
    public static void task6() {

        char unit = 0;
        float count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '1':
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - англ фунт, 3 - унция, 4 - пуд");
                unit = sc.next().charAt(0);
                break;
            case '2':
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                unit = sc.next().charAt(0);
                break;
            default:
                System.out.println("Нужно было ввести: 1 - масса или 2 - расстояние");
        }
        if (choice == '1' || choice == '2') {
            System.out.println("Введите число");
            count = sc.nextFloat();
            System.out.println("Результат:");
        }

        if (choice == '2') {
            switch (unit) {
                case '1':
                    System.out.println("Метры: " + count + "\n" +
                            "Мили: " + count * 0.00062 + "\n" +
                            "Ярды: " + count * 1.09361 + "\n" +
                            "Футы: " + count * 3.28084);
                    break;
                case '2':
                    System.out.println("Метры: " + count * 1609.34 + "\n" +
                            "Мили: " + count + "\n" +
                            "Ярды: " + count * 1760 + "\n" +
                            "Футы: " + count * 5280);
                    break;
                case '3':
                    System.out.println("Метры: " + count * 0.91 + "\n" +
                            "Мили: " + count * 0.00057 + "\n" +
                            "Ярды: " + count + "\n" +
                            "Футы: " + count * 3);
                    break;
                case '4':
                    System.out.println("Метры: " + count * 0.3 + "\n" +
                            "Мили: " + count * 0.00019 + "\n" +
                            "Ярды: " + count * 0.33 + "\n" +
                            "Футы: " + count);
                    break;
                default:
                    System.out.println("Для выбора единицы измерения нужно было ввести: 1, 2, 3 или 4. Результат не сформирован.");
            }
        }

        if (choice == '1') {
            switch (unit) {
                case '1':
                    System.out.println("Килограмм: " + count + "\n" +
                            "Фунт: " + count * 2.2 + "\n" +
                            "Унция: " + count * 35.27 + "\n" +
                            "Пуд: " + count * 0.061);
                    break;
                case '2':
                    System.out.println("Килограмм: " + count * 0.45 + "\n" +
                            "Фунт: " + count + "\n" +
                            "Унция: " + count * 16 + "\n" +
                            "Пуд: " + count * 0.028);
                    break;
                case '3':
                    System.out.println("Килограмм: " + count * 0.028 + "\n" +
                            "Фунт: " + count * 0.063 + "\n" +
                            "Унция: " + count + "\n" +
                            "Пуд: " + count * 0.0017);
                    break;
                case '4':
                    System.out.println("Килограмм: " + count * 16.38 + "\n" +
                            "Фунт: " + count * 36.11 + "\n" +
                            "Унция: " + count * 577.79 + "\n" +
                            "Пуд: " + count);
                    break;
                default:
                    System.out.println("Для выбора единицы измерения нужно было ввести: 1, 2, 3 или 4. Результат не сформирован.");
            }
        }


    }
}
