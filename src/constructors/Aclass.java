package constructors;

class Aclass {
    void yazdir () {
        System.out.println("burası Aclass");
    }
}
class Bclass extends Aclass{
    @Override
    void yazdir() {
        super.yazdir();//constructorları override yaptığımız zaman super yazmadan da içine uğrar ancak metodlarda
        // üst sınıfın metodunun içine girmek için super kodunu kullanmamız gerekmektedir.
        System.out.println("burası Bclass");
    }
}
class Calistir{
    public static void main(String[] args) {
        Bclass nesne = new Bclass();
        nesne.yazdir();
    }
}
