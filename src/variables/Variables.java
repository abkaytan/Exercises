package variables;


public class Variables {

    static int deger = 5;
    static String kelime = "static anahtar kelimesinin anlamı";

    public static void main(String[] args) {


        System.out.println(deger);

        Variables d1 = new Variables();
        Variables d2 = new Variables();
        d1.deger = 7;
        d2.deger = 8;

        System.out.println(d1.deger);

        deger = 9;

        System.out.println(d2.deger);

        System.out.println(d1.kelime);
        System.out.println(Variables.deger);
        System.out.println(Variables.kelime);



        System.out.println("\n**************");
        System.out.println(Statikdeneme.deger);


        Nesnedeneme d4 = new Nesnedeneme();
        System.out.println("\n**************");
        System.out.println(d4.deger);
        d4.deger = 16;
        System.out.println(d4.deger);

    }

}

/*sınıf değişkenleri static olduğu zaman nesne bağımsızdırlar
yani bu durumda sınıf değişkenlerine nesne oluşturmadan da erişebiliriz*/

class Statikdeneme {

    static int deger = 11;

}

class Nesnedeneme {

    int deger = 15;

}
