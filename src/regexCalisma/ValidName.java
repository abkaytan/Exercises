package regexCalisma;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidName {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("give name for validation or write exit : ");
        String name = kb.nextLine();

        while(!name.equals("exit")){
            System.out.println(Utils.isVariable(name)? "Geçerli": "Geçersiz");
            name = kb.nextLine();
        }

        /*if (!(name.equals("exit"))) {
            System.out.println(Utils.isVariable(name) ? "Geçerli" : "Geçersiz");
        } else {
            System.out.println("EXIT");
        }*/
    }
}

class Utils {
    public static boolean isVariable(String s) {
        //String patternStr = "^[a-z_A-Z][a-zA-Z0-9]*$";
        String patternStr = "^[a-z_A-Z][a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return true;
        } else {return false;}

        /*int count = 0;

        while (m.find()) {
            count++;
            if (count == 2)
                break;
        }
        return count == 1;
        }*/

    }
}

