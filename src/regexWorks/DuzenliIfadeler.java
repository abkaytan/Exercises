package regexWorks;

public class DuzenliIfadeler {
    public static void main(String[] args)
    {
        String str = "Bugün" + (char)13 + "hava" + (char)13 + "çok" + (char)13 +"guzel";

        //System.out.println(str);
        String [] words = str.split(String.format("[%c]+", (char)(13)));
        // (char)(13) ---> satır başı
        // "[%c]+" ---> String format, character at least one, we can use %s also that means any type

        for (String s : words)
            System.out.println(s);

        System.out.println("************");


        String abk = "ali mehmet ahmet aysel kazım";
        String [] abks = abk.split(" ");
        for(String a: abks)
            System.out.println(a);

    }
}

