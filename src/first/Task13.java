package first;

import java.util.Scanner;

public class Task13 {
    public static void task13() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку слов, разделенных пробелами");
        String first = sc.nextLine();

        String[] result = first.split(" ");
        int count = 0;
        System.out.println("Слова только на латинице:");
        for (String elem : result) {
            boolean onlyLatinAlphabet = elem.matches("^[a-zA-Z]+$");
            if (onlyLatinAlphabet) {
                System.out.print(elem + " ");
                count++;
            }
        }
        System.out.println("\nВсего слов в строке  " + count);
    }
}
