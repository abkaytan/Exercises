package toString;

public class Sekil {
    int kose;
    int kosegen;
    int icAci;

    public Sekil(int kose) {
        this.kose = kose;
        kosegen = (kose*(kose-3))/2;
        icAci = (180*(kose-2))/kose;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "kose=" + kose +
                ", kosegen=" + kosegen +
                ", icAci=" + icAci +
                '}';
    }
}

class toStringOrnegi {
    public static void main(String[] args) {
        Sekil geometrik = new Sekil(6);
        System.out.println(geometrik); //to string düzenlemesi nesneyi komple yazdırırken yapılan bir tanımla
        //bu tanımlama yapılmazsa paket+sınıf ve referans yerini gösterir
        System.out.println("köşe sayısı: " + geometrik.kose);
        String s1 = "altıgen "+ geometrik;
        System.out.println(s1);

    }
}




