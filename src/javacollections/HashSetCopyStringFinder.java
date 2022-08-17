package javacollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class HashSetCopyStringFinder {
    public static void main(String[] args) {

        String s = "hello java world hello java";

        StringTokenizer st = new StringTokenizer(s);
        int number = st.countTokens();
        String[] stringsArray = new String[number];

        for(int i=0; i < number; i++){
            stringsArray[i] = st.nextToken();
        }
        Arrays.sort(stringsArray);
        System.out.println(Arrays.asList(stringsArray));

        HashSet<String> hashSet = new HashSet<>();
        boolean check;
        for(int k = 0 ; k<stringsArray.length ; k ++){
            check = hashSet.add(stringsArray[k]);
            if(check==false){
                System.out.println("copy word is : " + stringsArray[k]);
            }
        }
        System.out.println(hashSet);

    }
}
