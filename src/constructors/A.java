package constructors;


class A {
    public A() {
        System.out.println("A'nın yapıcısındayız");
    }

}

class B extends A {
    public B() {
        super(); //A nin yapıcı çağrıldı, ancak bu komut yazmasa dahi A sinifinin yapicisi çalışacaktı
        //ancak overloading kısmında super() kodu daha da anlamlı hale geliyor.
        System.out.println("B' nin yapıcısındayız");
    }

    public static void main(String[] args) {
        B nesne = new B();
    }
}

