public class Practice1_1 {
    public static int number = 1;//глобальные
    public static final String IMAGE_PATH = "c:\\temp";

    public static void main(String[] args) {
        number = 22;
        System.out.println(IMAGE_PATH);
        int number = 1;//локлаьная

        //static что это??
        String s = mm();
        System.out.println(s);
    }


    private static String mm() {
        System.out.println(number);
        return "Tttt";
    }

    String newMethod() {
        System.out.println(IMAGE_PATH);
        mm();
        System.out.println(number);
        return "Tttt";
    }


}
