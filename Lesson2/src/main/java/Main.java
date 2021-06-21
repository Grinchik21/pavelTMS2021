class Main {

    /**
     * Выводит Hello!
     *
     * @param args - входные параметры метода
     */
    public static void main(String[] args) {

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("sdjfldsjfl");

        Practice1_1 practice1_1 = new Practice1_1();
        practice1_1.newMethod();
        Practice1_1.main(null);

        Practice1_1.number = 123;
        System.out.println(Practice1_1.IMAGE_PATH);

        Practice1_1 practice1_2 = new Practice1_1();
        practice1_2.newMethod();

        System.out.println(Math.sqrt(64));

    }
}
