package arraysstudy;

import java.util.*;

public class CollectionsStudy {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(17);
        list.add(7);
        list.add(1);

        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }



    }

}
