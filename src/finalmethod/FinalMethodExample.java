package finalmethod;


public class FinalMethodExample {

    int z;

    public void al(final int y){
        z = y+y ;

    }

    @Override
    public String toString() {
        return "FinalMethodExample{" +
                "y=" + z +
                '}';
    }



    public static void main(String[] args) {
        FinalMethodExample d1 = new FinalMethodExample();
        int y = 7;
        d1.al(y);
        System.out.println(d1);
        int x=8;
        d1.al(x);
        System.out.println(d1);
    }
}