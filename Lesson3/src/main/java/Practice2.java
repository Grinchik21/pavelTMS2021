public class Practice2 {
    /**
     * объяснение
     * https://metanit.com/java/tutorial/2.13.php
     **/
    public static void main(String[] args) {

        boolean b = false;
        boolean k = true;

        int mm = 8;
        mm += 2;
        k = !b;

        System.out.println(true || false);//true
        System.out.println(false && true);//false
        System.out.println(true ^ false); //XOR логическое исключающее ИЛИ //true
        System.out.println(true && !false);//true
        //System.out.println(1 & ~0);//~ (логическое отрицание) & (логическое умножение)//
        System.out.println(more(5, 3) | less(10, 7));//
        System.out.println(more(5, 3) && less(7, 10));//

        System.out.println(more(5, 3) | less(7, 10));
        System.out.println(more(5, 3) || less(7, 10));
        System.out.println(14.5 % 3);//14.5-(3*4)=14.5-12=2.5
    }

    private static boolean is5More3(int i, int i2) {
        return i > i2;
    }

    private static boolean more(int a, int b) {
        System.out.print("check ");
        return a > b;
    }

    private static boolean less(int a, int b) {
        System.out.print("check ");
        return a < b;
    }
}
