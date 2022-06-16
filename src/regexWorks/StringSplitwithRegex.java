package regexWorks;

public class StringSplitwithRegex {
    public static void main(String[] args) {
        String str = "    Bugün hava      :;?çok güzel";

        for (String s : Utilsplit.split(str, " :;?", StringSplitOptions.REMOVEEMPTYENTRIES)) {
            System.out.println(s);
        }
        /*for (String s : Utilsplit.split(str, " :/t;?", StringSplitOptions.REMOVEEMPTYENTRIES)) {
            System.out.println(s);
        }*/


        /*for (String s : Utilsplit.split(str, " ", StringSplitOptions.REMOVEEMPTYENTRIES)) {
            System.out.println(s);
        }*/

    }
}

enum StringSplitOptions {NONE, REMOVEEMPTYENTRIES}

class Utilsplit {
    public static String[] split(String s, String delims, StringSplitOptions op) {
        if (s == null || delims == null || delims.isEmpty() || op == null)
            throw new IllegalArgumentException("Invalid arguments");

        String regex = "[" + delims + "]";

        //System.out.println(regex);

        if (op == StringSplitOptions.REMOVEEMPTYENTRIES)
            regex += "+";

        return s.split(regex);
    }
}