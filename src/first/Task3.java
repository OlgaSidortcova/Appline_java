package first;

public class Task3 {
    public static void arr() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int b = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = b;

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Сумма первого и среднего = " + (array[0] + array[array.length / 2]));
    }
}
