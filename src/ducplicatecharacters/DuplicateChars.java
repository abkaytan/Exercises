package ducplicatecharacters;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class DuplicateChars {

    static String countChars (String str){

        char[] charS = str.toLowerCase().toCharArray();
        Arrays.sort(charS);
        List<String> asd = new ArrayList<>();
        /*String sorted = new String(charS);
        System.out.println(sorted); */

        StringBuilder result= new StringBuilder("");

        for(int i=0 ; i<charS.length; i++){
            char checker = charS[i];
            int count=0;

            if(checker!=1) {
                for (int j = 0; j < charS.length; j++) {
                    if (checker == charS[j]) {
                        count++;
                        charS[j] = 1;
                    }
                }
                if(count>1) {
                    result.append(checker).append(count);
                    //result.append(checker);
                }
            }
        }

        str = result.toString();
        return str;
    }

    public static void main(String[] args) {
        String str = "HelloJavaWorld";
        System.out.println(countChars(str));
    }
}
