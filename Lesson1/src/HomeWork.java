public class HomeWork {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int i = Integer.parseInt(arg);
            if (i > 0) {
//                count++;
                count = count + 1;
            }
        }
        System.out.println(count);
        //вариант со сканером
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        System.out.println(line);
//        scanner = new Scanner(line);
//        while (scanner.hasNext()) {
//            int value = scanner.nextInt();
//            if (value > 0) {
////                count++;
//                count = count + 1;
//            }
//        }
//        System.out.println(count);
    }

}
