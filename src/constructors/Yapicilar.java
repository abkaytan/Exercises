package constructors;

public class Yapicilar {

    static int sayi = 0;

    public Yapicilar() {
        sayi++;
        System.out.println("yapicilar constructor'ı içindesin ");
        System.out.println(sayi);
    }

    public static void dongu(Yapicilar nesne[]) {
        for (int i = 0; i < 4; i++) {
            nesne[i] = new Yapicilar();
            System.out.println("dongu metodunun içindesin");
            System.out.println(sayi);
            System.out.println("************");
        }
    }

    public static void main(String[] args) {
        Yapicilar nesne[] = new Yapicilar[4];

        Yapicilar.dongu(nesne);
        System.out.println(sayi + "  adet nesne oluşturuldu");
    }
}
