package regexCalisma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMailWork {
    public static void main(String[] args)
    {
        String regex = "@[a-zA-Z0-9.]+";
        String text = "oguzkaran@csystem.org";

        Pattern pattern = Pattern.compile(regex);

        Matcher m = pattern.matcher(text);

        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

    }
}
