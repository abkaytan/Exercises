package javacollections;

import java.util.*;

public class NotImportant {

    public static void main(String[] args) {

        String s1 = "hello java world";
        char[] charS = s1.toCharArray();
        //System.out.println(charS.length);
        System.out.println(charS[1]);
        System.out.println(s1.charAt(1));

        Integer[] array1 = {3,6,9,2};
        List<Integer> list1 = Arrays.asList(array1);
        System.out.println(list1);

        Character[] asd = {'5','6','7'};
        List<Character> asd1 = Arrays.asList(asd);
        System.out.println(asd1);

        StringTokenizer tokenizer = new StringTokenizer(s1," ");
        List<String> stringList = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            stringList.add(tokenizer.nextToken());
        }
        System.out.println(stringList);

        //ListIterator it = stringList.listIterator();

        stringList.remove(stringList.indexOf("hello"));

        System.out.println(stringList);

        stringList.add(0,null);
        stringList.add(null);
        stringList.add("asd");
        stringList.add(null);

        System.out.println(stringList);


        while (stringList.contains(null)){
            stringList.remove(null);
        }

        System.out.println(stringList);






    }

}
