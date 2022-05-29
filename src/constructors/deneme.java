package constructors;

public class deneme {

    private String name;
    static int yas=25;

    public deneme(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }

    public static void main(String[] args) {
        deneme insan1 = new deneme("ali", 45);

        System.out.println(insan1.name);
        System.out.println(insan1.yas);

        System.out.println(yas);

    }
}
