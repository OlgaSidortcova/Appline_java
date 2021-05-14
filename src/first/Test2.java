package first;

import java.util.Scanner;
import java.util.Arrays;


public class Test2 {
    public static void arr1() {
        int[][] twoDimArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}}; //объявили массив и заполнили его элементами
        for (int i = 0; i < twoDimArray.length; i++) {  // идём по строкам
            for (int j = 0; j < twoDimArray[0].length; j++) {  // идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " ");  // вывод элемента
            }
            System.out.println();

        }
        // System.out.println(twoDimArray.length);
        // System.out.println(twoDimArray[0].length);
    }

    public static void arr2() {
        int[][] myArray = {{18, 28, 18}, {28, 45, 90}, {45, 3, 14}};
        //  System.out.println(Arrays.deepToString(myArray));
        // System.out.println(myArray[0].length);

        //float f2[] = new float[];
        float f3[] = new float[3];
        float[] f1 = new float[3];
        // float[] f = new float(3);
        //float f5[] = {1 .0f, 2.0f,2.0f};
        int[] scores = {3, 5, 7};
        String cats[] = {"Fluffy", "Spot", "Zeus"};
        boolean results[] = new boolean[]{true, false, true};
        double array[] = {3, 5, 8};
        int[][] scores1 = {{2, 7, 6}, {9, 3, 45}};
        int[] a = new int[10];
    }

    public static void test() {
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        a = b = c;
        System.out.println(a);

    }

    public static void test2() {
        /*boolean a = 2==1+1 | true;
        System.out.println(a);
        if (true && false){
            System.out.println(true && false);
        }System.out.println(true && false);
        */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        int c = calc(30, 50);
        System.out.println(c);

        int i = 1;
        switch (i) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println(4);
        }
    }

    public static int calc(int a, int b) {
        if (a == 30) {
            return a + b;
        } else if (a == 50) {
            return a - b;
        }
        return 80;
    }

    public static void test5(){
        int x = 5;
        int y = 60;
        for ( ; x < y; x +=10, y -- );
        System.out.println("x равен" + x + "y равен = "+ y);
    }
}