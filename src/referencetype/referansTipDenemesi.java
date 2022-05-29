package referencetype;

public class referansTipDenemesi {
    static int x;

    public static void main(String[] args) {

        referansTipDenemesi t1 = new referansTipDenemesi();
        t1.x= 5;
        System.out.println(t1.x);
        t1.degistir(5);
        System.out.println(t1.x);
        System.out.println(x);


    }


    void degistir(int x) {
        x += 10;
        System.out.println(x);

    }
    /*
    void degistir(referansTipDenemesi t1) {
        t1.x = t1.x+ 10;


    }
    //böyle yazıldığı zaman metod içine referansTipDenemesi referansı referans tip bir veri
    //gönderilmiş olacaktı ve x değeri referans tip içinde metoda gönderildiği için bu sefer kalıcı olarak değişecekti
    // int x gibi primitive değişkenlerde metoda kopya gönderilir o sebeple main metod içindeki x değeri
    //örnekte aktif olan uygulamada değişmişiyor
     */

}
class hayvan{} // bir public sınıfın yanında başka bir public sınıf tanımlanamaz, içinde tanımlamayı deneyince
//herhangi bir sıkıntı çıkmadı, public class referansTipDenemesi sınıfının dışındaki tanımladığım örnek sınıfta
//public kelimesini bu nedenle kullanmadım
