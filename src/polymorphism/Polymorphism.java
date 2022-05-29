package polymorphism;


/*
nesnelerin programın çalışma anında belirlenmesine Geç Bağlama denir.
 */

class Canli {
    public void yaz() {
        System.out.println("Canlı Sınıfı");
    }
}
class Insan extends Canli{
    public void yaz() {
        System.out.println("Insan Sınıfı");
    }
}
class Hayvan extends Canli{
    public void yaz() {
        System.out.println("Hayvan Sınıfı");
    }
}
class Bitki extends Canli{
    public void yaz() {
        System.out.println("Bitki Sınıfı");
    }
}

public class Polymorphism {
    /*nesneAl metodu canli parametresi cinsinden nesne almasına rağmen alt sınıflarından gelen nesneleri
    kendi ait oldukları sınıf parametresindenmiş gibi değerlendirdi.
     */
    public static void nesneAl(Canli c) {
        c.yaz();
    }

    public static void main(String[] args) {
        Canli [] h = new Canli[3];

        for (int i=0; i<3; i++) {
            int indis = (int) (Math.random()*3);//rastgele rakam oluşturma {0,1,2}

            switch (indis) {

                case 0:
                    h[indis] = new Bitki();//upcasting
                    nesneAl(h[indis]);
                    break;
                case 1:
                    h[indis] = new Hayvan();//upcasting
                    nesneAl(h[indis]);
                    break;
                case 2:
                    h[indis] = new Insan();//upcasting
                    nesneAl(h[indis]);
                    break;

            }
        }
    }
}
