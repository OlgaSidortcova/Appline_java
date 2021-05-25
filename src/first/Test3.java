package first;

public class Test3 {
    public static void test3() {
        int result;
        String str = "Hello World!";
        // "HelloWorld".compareTo(str) вернет тип int '55'. В переменную result запишется '55'
        result = "HelloWorld".compareTo(str);
        // str.compareTo("Hello World") вернет тип int '1'. В переменную result запишется '0'
        result = str.compareTo("Hello World");
        // str.compareTo("HelloWorld") вернет тип int '-55'. В переменную result запишется '-55'
        result = str.compareTo("HelloWorld");
        byte b = 3;
        int x = b;
        double y = 10.38;
        x = (int) y;
        // System.out.println(x);
        //String byteStr  = (String) b;
        int i = 3;
        switch (i) {
            case 1:
                System.out.println("1");
                //  unit = sc.next().charAt(0);
                break;
            default:
                System.out.println("3");
            case 2:
                System.out.println("2");
                // unit = sc.next().charAt(0);
                break;

        }
        String s1 = "AB";
        String s2 = "A" + "B";
        System.out.println(s1 == s2);
        System.out.println(s2.equals(s1));
        System.out.println(s1.toString() == s2.replaceAll("a", "b"));
        System.out.println(s2.equals("ab"));

        double d = 55.6;
        float f = (float) d;
        byte b1 = (byte) d;
        int a[] = new int[]{1, 2, 3};
//a[a.length]=5;
        int k = 0;
        System.out.print(++k);
        System.out.print(k++);

        System.out.print(k);

    }
}
