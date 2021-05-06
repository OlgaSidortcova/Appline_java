package first;

import java.util.Scanner;

public class Test1 {

    public static void printIo() {
        System.out.println("Appline!");
        System.out.println(5);
        System.out.println("Mama" + "Mila" + "Ramu");
        System.out.println("Appline is a company!");
        System.out.println("Appline" + "is a company!");
        System.out.println("Appline" + " " + "is a company!");
        System.out.println(1 + 2);
        System.out.println("3" + "4");
        System.out.println(5 + "6");
        System.out.println("7" + 8);
        System.out.println("9" + 10 + 11);
        System.out.println("1" + 2 + 3 + "4");
        System.out.println("1" + (2 + 3) + "4");

    }

    public static void print2() {
        System.out.print("Appline!");
        System.out.print("-Апплайн!-");
        System.out.print("Appline!");
    }

    public static void print3() {
        // Результат выполнения метода printf() будет вывод на консоль:
        // "Корень числа 675 равен 25.980762":
        System.out.printf("%s %s %d равен %f", "Корень", "числа", 675, 25.980762);

    }

    public static void print4() {
        System.out.println("App\bline!");
        System.out.println("App\fline!");
        System.out.println("App\nline!");
        System.out.println("App\tline!");
        System.out.println("App\rline!");
        System.out.println("App\'line!");
        System.out.println("App\"line!");
        System.out.println("App\\line!");
    }


    public static void print5() {

        // вызываем конструктор класса Scanner и передаем в него объект System.in -> new Scanner(System.in)
        // таким образом будет создан объект класса Scanner, который сможет работать с потоком ввода с консоли
        // сохраняем данный объект в переменную in для дальнейшего взаимодействия в программы
        Scanner in = new Scanner(System.in);

        // просто печать текста в консоли для пользователя
        // предлагаем ввести число
        System.out.println("Input a number: ");

        // используя переменную in мы обращаемся к объекту Scanner, который был раннее создан в строке 12
        // вызываем метод nextInt(), который будет ожидать ввода данных в консоль, т.е числа.
        // метод nextInt() - возвращает введенное с клавиатуры целочисленное значение.
        // прочитанное число будет возвращено методом nextInt(), поэтому сохраняем число в переменную num
        int num = in.nextInt();

        // далее происходит печать результата,
        // если пользователь введет число 5, то в конце мы должны увидеть результат:
        // Your number: 5
        // The end
        System.out.printf("Your number: %d \nThe end", num);
    }

    // Так как в нашей программе нам потребуется класс Scanner
    // то мы должны вначале его импортировать с помощью инструкции import java.util.Scanner;


    public static void print6() {

        // вызываем конструктор класса Scanner и передаем в него объект System.in -> new Scanner(System.in)
        // таким образом будет создан объект класса Scanner, который сможет работать с потоком ввода с консоли
        // сохраняем данный объект в переменную in для дальнейшего взаимодействия в программы
        Scanner in = new Scanner(System.in);

        // просто печать на консоль, предлагаем ввести имя
        System.out.println("Input name: ");
        // используя переменную in мы обращаемся к объекту Scanner, который был раннее создан в строке 12
        // вызываем метод nextLine(), который будет ожидать ввода данных в консоль, т.е строки, например Tyler-James
        // метод nextLine() - возвращает введенное с клавиатуры строку.
        // прочитанная строка будет возвращена методом nextLine(), поэтому сохраняем строку в переменную name
        String name = in.nextLine();

        // печатаем на консоль. Предлагаем ввести возраст
        System.out.println("Input age: ");
        // используя переменную in мы обращаемся к объекту Scanner, который был раннее создан в строке 12
        // вызываем метод nextInt(), который будет ожидать ввода данных в консоль, т.е числа, например 25
        // метод nextInt() - возвращает введенное с клавиатуры целочисленное значение.
        // прочитанное число будет возвращено методом nextInt(), поэтому сохраняем число в переменную age
        int age = in.nextInt();

        // печатаем на консоль. Предлагаем ввести рост в метрах
        System.out.println("Input height (m.): ");
        // используя переменную in мы обращаемся к объекту Scanner, который был раннее создан в строке 12
        // вызываем метод nextFloat(), который будет ожидать ввода данных в консоль, т.е числа, например 1.8
        // метод nextFloat() - возвращает введенное с клавиатуры дробное числовое значение.
        // прочитанное число будет возвращено методом nextFloat(), поэтому сохраняем число в переменную height
        float height = in.nextFloat();

        // далее происходит печать результата,
        System.out.printf("Name: %s Age: %d Height: %.2f", name, age, height);
    }
}

