package regexWorks;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsWithUCharacters {
    public static void main(String[] args) {
        String str = "1Ö223Ö";

        String pattern = "^[a-z" + '\u00D6' + "0-9]+$";
        // String pattern = "^[a-z\u00D60-9]+$";  // same with previous pattern

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(str);

        while (m.find())
            System.out.println(str.substring(m.start(), m.end()));
    }
}