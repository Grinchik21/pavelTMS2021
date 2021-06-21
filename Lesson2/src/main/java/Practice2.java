public class Practice2 {


    public static void main(String[] args) {

        long kkk = 0;
        int bb = 1;
        System.out.println(++bb);//2

        System.out.println(bb++);//2
        System.out.println(bb);//3
//
        boolean g = 5 > 2;
        boolean h = 9 < 1;
        if (!g || h) {
            System.out.println(g && h);
        }

        System.out.println("fff");

        long kk = 19L;
        double d = 4.6d;
        System.out.println((int) d);

        byte b = (byte) 128;
        byte b2 = 23;
        System.out.println(b2);
        long n = 100L;
        System.out.println(++b);
        int[] mas = new int[5];
        String s = "\tsdfdf";
        System.out.println(s);
        System.out.println("ddd");


        char c = 'f';
        boolean nn = true;

        //3 массивы сылочные типы
        int[] arr = new int[10];
        int[] arr2 = {3, 2};

        //переменная
        int count2;
        count2 = 34;
        count2 = 56;

        final int count = 0; //объявление и инициализация
        //count++;
        //есть конвенция назавания переменных.

        long k = 100l;
        char ch = 'f';
        //типы данных
        int a = 15;
        //byte b = a;// не одобряет
//        byte -> short -> int -> long // расширение
//        https://metanit.com/java/tutorial/2.2.php
        //double d = 2.99;
        int v = (int) d; // что будет? // сужение
        Math.round(d);

        byte mmmm = (byte) 3l;

        long m3 = 3L;
        double dsss = 3.4d;
        double fdd = 3.4f;

        System.out.println("!!!");
        long aa = Long.MAX_VALUE;
        int bbff = (int) aa;
        System.out.println(aa);
        System.out.println(bbff);
        System.out.println("!!!");


        //операторы
        double m = d + a;
        // int 7/4 = 1 остаток от деления 7%4=3
        int bbb = 1;
        System.out.println(++bbb);

        System.out.println(bbb++);

    }
}
