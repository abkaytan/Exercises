package arraysstudy;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String , Integer> hashMap = new HashMap();
        hashMap.put("ali", 12);
        hashMap.put("bkaytan", 56);
        hashMap.put("abkode", 58);

        System.out.println(hashMap);

        System.out.println(hashMap.keySet());

        int checker = 0;
        String winner = "";
        for(String s : hashMap.keySet()){
            if(hashMap.get(s)>checker){
                checker = hashMap.get(s);
                winner = s;
            }
        }

        System.out.println(winner);
    }
}
