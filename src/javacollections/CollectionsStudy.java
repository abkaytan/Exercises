package javacollections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsStudy {


    public static void main(String[] args) {


        //****** HASHSET ******//
        System.out.println("****** HASHSET ******");
        HashSet<String> hashSet = new HashSet();
        hashSet.add("ali");
        hashSet.add("bkaytan");
        hashSet.add("asd");
        System.out.println(hashSet);

        Iterator i = hashSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            i.remove();
        }
        System.out.println(hashSet);

        //****** TREESET ******//
        System.out.println("****** TREESET ******");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ali");
        treeSet.add("bkaytan");
        treeSet.add("asd");
        System.out.println(treeSet);
        if (treeSet.contains("asd")) {
            treeSet.remove("asd");
            //treeSet.add(null);
        }
        System.out.println(treeSet);


    }


}
