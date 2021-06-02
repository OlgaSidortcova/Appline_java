package first;

import java.util.Scanner;

public class Fin2 {
    public static void fin2() {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("");
        System.out.println("Введите уравнение");
        char first_operand = '1';
        char second_operand = '1';
        char operation = '+';
        char equals = '1';
        char rezult = '1';

        char symbol = '1';
        int count_x = 0;

        for (int i = 0; i < 5; i++) {

            symbol = sc.next().trim().charAt(0);

            switch (i) {
                case 0:
                    if (!(Character.isDigit(symbol) || symbol == 'x'|| symbol == 'х')) {
                        System.out.println("Не уравнение: первый операнд не цифра и не икс, а" + symbol);
                        return;
                    }
                    first_operand = symbol;
                    if ((symbol == 'x') || (symbol == 'х')){
                        count_x++;
                    }
                    break;

                case 1:
                    if (!((symbol == '-') || (symbol == '+'))) {
                        System.out.println("Не уравнение: знак не плюс и не минус на второй позиции");
                        return;
                    }
                    operation = symbol;
                    break;

                case 2:
                    if (!(Character.isDigit(symbol) || symbol == 'x' || symbol == 'х')) {
                        System.out.println("Не уравнение: второй операнд не икс и не цифра, а " + symbol);
                        return;
                    }
                    if ((symbol == 'x') || (symbol == 'х')){
                        count_x++;
                    }
                    second_operand = symbol;
                    break;

                case 3:
                    if (symbol != '=') {
                        System.out.println("Не уравнение: нет знака равно на 4 позиции");
                        return;
                    }
                    equals = symbol;
                    break;

                case 4:
                    if (!(Character.isDigit(symbol) || symbol == 'x' || symbol == 'х')) {
                        System.out.println("Не уравнение: справа не цифра и не икс, а " + symbol);
                        return;
                    }
                    if ((symbol == 'x') || (symbol == 'х')){
                        count_x++;
                    }
                    rezult = symbol;

            }
        }

        if (count_x != 1) {
            System.out.println("Не уравнение: количество иксов = " + count_x);
            return;
        }


        if ((first_operand == 'x') ||(first_operand == 'х')){
            if (operation == '+') {
                System.out.println("x = " + (Character.digit(rezult, 10) - Character.digit(second_operand, 10)));
            } else {
                System.out.println("x = " + (Character.digit(rezult, 10) + Character.digit(second_operand, 10)));
            }
        } else if ((second_operand == 'x') || (second_operand == 'х')){
            if (operation == '+') {
                System.out.println("x = " + (Character.digit(rezult, 10) - Character.digit(first_operand, 10)));
            } else {
                System.out.println("x = " + (Character.digit(first_operand, 10) - Character.digit(rezult, 10)));
            }
        } else {
            if (operation == '+') {
                System.out.println("x = " + (Character.digit(second_operand, 10) + Character.digit(first_operand, 10)));
            } else {
                System.out.println("x = " + (Character.digit(first_operand, 10) - Character.digit(second_operand, 10)));
            }

        }

    }


}
