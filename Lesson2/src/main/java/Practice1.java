public class Practice1 {

    public static void main(String[] args) {
        System.out.println(12);
        System.out.println(12.3);
        System.out.println("Privet!");
        System.out.println("\"Privet\"");


        char c = 'c';

        String n = "sdfds";
        Integer i = 3;

//                Character
        boolean b = false;
        boolean b2 = true;
        Boolean nn = null;
        nn = Boolean.TRUE;
        //вычисления
        nn = Boolean.FALSE;

        Boolean mm22 = Boolean.FALSE;
        System.out.println(mm22.toString());


        String sd = new String("sd");
        nn.toString();//NPE


        int i3 = 3;
        System.out.println(i3);

        System.out.println("Hello ");
        System.out.println("Students");// как сделать одной строкой?

        System.out.println("Hello\nStudents");
        Integer simpleCountValue = 3;


        int one = 0b00000001; //для двоичного кода
        System.out.println(one);

        int mm = 0b00000101; //для двоичного кода
        System.out.println(mm);
        System.out.println(mm + 2);
//        //1*2^2+0*2^1+1*2^0=4+0+1=5;
//        Long

//        Byte.MIN_VALUE
        //Long
        System.out.println(0b01111111);//
        byte minValue = (byte) 0b10000000;
//        System.out.println(0b10000000);//

        System.out.println(Integer.toBinaryString(Integer.parseInt("11111010", 2) + Integer.parseInt("00000001", 2)));
        Byte aByte = new Byte(String.valueOf(3));
        byte m = (byte) 128;
        System.out.println("!");
        System.out.println(m);


        int bb = 12;
//        System.out.println(bb++);
//        bb--;
//        --bb;
//        System.out.println(++bb);


        int kk = 1 + ++bb;
        System.out.println(kk);
        System.out.println(bb);

        //count++;

//        m = m + 1;

        m++;
        System.out.println((byte) m);


        findPracticeById();
    }

    private static void findPracticeById() {
        System.out.println("Нашли объект практис");
    }

    private static void findById() {
        System.out.println("Наш");
    }


}
