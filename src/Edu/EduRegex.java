package Edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EduRegex {
    public static void main(String[] args) {
        // String Class 이용
        String str = "Hello World";
        String pattren1 = "[0-9]+";
        String pattren2 = "[a-zA-Z ]+";
        System.out.println(str.matches(pattren1));
        System.out.println(str.matches(pattren2));

        // Regex Package 이용
        Pattern pattern3 = Pattern.compile("[0-9]+");
        Pattern pattern4 = Pattern.compile("[a-zA-Z ]+");

        Matcher matcher3 = pattern3.matcher(str);
        Matcher matcher4 = pattern4.matcher(str);

        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
    }
}
