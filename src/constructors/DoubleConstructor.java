package constructors;

public class DoubleConstructor {

    private String isim;
    private int yas;

    /*
    public DoubleConstructor(String isim) {
        this(isim, 30);
    }
    public DoubleConstructor(String isim, int yas) {
        System.out.println(isim + " " + yas);
        System.out.println("doubleconstructor yapısı uygulanmış oldu");
    }
     */


    public DoubleConstructor(String isim) {
        this.isim = isim;
        DoubleConstructor dc2 = new DoubleConstructor("isim",30);

    }

    public DoubleConstructor(String isim, int yas) {

        this.isim=isim;
        this.yas=yas;
        System.out.println("double constructor yapısı uygulandı");

    }





    public static void main(String[] args) {

        DoubleConstructor dc = new DoubleConstructor("Ali");

    }
}
