package constructors;

class Asinifi {

    public Asinifi(){
        System.out.println("parametresiz default constructor");
    }
    public Asinifi(int a) {
        System.out.println("Asinifi tek parametreli yapıcıdayız");
    }
    public Asinifi(int a, int b) {
        System.out.println("Asinifi çift parametreli yapıcıdayız");
    }

}

class Bsinifi extends Asinifi {
    public Bsinifi() {
        super(4,7); // super komutu ile Asinifindaki constructorlardan iki parametreli olanı çağırdık
        System.out.println("B' nin yapıcısındayız");
    }

    public static void main(String[] args) {
        Bsinifi nesne = new Bsinifi();
    }
}

