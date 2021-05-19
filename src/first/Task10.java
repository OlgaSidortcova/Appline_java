package first;

import java.util.Scanner;

public class Task10 {
    public static void task10() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер матрицы. Строк ");
        int count_x = sc.nextInt();

        System.out.println("Столбцов ");
        int count_y = sc.nextInt();
        System.out.println("Заполним матрицу ");
        int[][] array = new int[count_x][count_y];

        for (int i = 0; i < count_x; i++) {
            for (int j = 0; j < count_y; j++) {

                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Вот такая матрица");
        for (int i = 0; i < count_x; i++) {
            for (int j = 0; j < count_y; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Первая строчка, где все элементы умножены на 3");

        for (int j = 0; j < count_y; j++) {
            System.out.print(array[0][j] * 3 + " ");

        }
    }
}