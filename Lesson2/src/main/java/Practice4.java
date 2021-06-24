public class Practice4 {

    static int countValue;
    static boolean flag;
    static char c;
    String string;//null

    public static void main(String[] args) {
//        int a = 5;
//        byte b = a;

//        float f = 44.4;
        long kk = 41115L;
        float f = (float) 2.3;
        float f1 = 2.3f;


        int bb = 1;
        System.out.println(bb);//1
        System.out.println(++bb);//2
        System.out.println(bb++);//2
        System.out.println(bb);//3


        System.out.println(c);
        mm3(countValue, flag);


        final int count = 0; //объявление и инициализация
        long k = 100l;

        System.out.println(7 / 4);//1
        System.out.println(7 % 4);//3

    }

    private static void mm3(int countValue, boolean flag) {
        System.out.println(countValue);//0
        System.out.println(flag);
    }

}
