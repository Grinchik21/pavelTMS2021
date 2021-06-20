import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(getNumber("M+37539234324/RU"));
        System.out.println(getNumber("S7/M +37539234324"));
        System.out.println(getNumber("S7/M 37539234323323234/RU S7"));
    }

    private static String getNumber(String str) {
        String number = null;
        Pattern pattern = Pattern.compile("(\\d{2,})");
        Matcher match = pattern.matcher(str);
        if (match.find()) {
            number = match.group(1);
        }
        return number;
    }

}
