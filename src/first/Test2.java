package first;

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
        float[]f1 = new float[3];
       // float[] f = new float(3);
        //float f5[] = {1 .0f, 2.0f,2.0f};
        int[] scores = {3, 5, 7};
        String cats[] = {"Fluffy", "Spot", "Zeus"};
        boolean results[] = new boolean[]{true, false, true};
        double array[] = {3, 5, 8};
        int [ ][ ] scores1 = {{2,7,6}, {9,3,45}};
        int []a= new int [10];
    }
}