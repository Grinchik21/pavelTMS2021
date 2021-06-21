public class Practice3 {

    public static final String IMAGE_PATH = "C:\\temp";

    public static void main(String[] args) {
        if (IMAGE_PATH != null) {//константа
            System.out.println("");
        }
        int[] mass = new int[4];

        methtod(mass);
    }

    private static void methtod(int[] mass) {
        //нельзя достучаться до масс переменной из метода можно передать в метод
        int i = 0;

        //рассказать про память heap stack
        //как пробежать по масиву
        //+ массивов мало памяти весит, практически не юзают
    }
}
