package javacollections;
import java.util.Arrays;
public class Generics {
    public static void main(String[] args) {
        GenExam dinamicArray = new GenExam();
        dinamicArray.add(123);
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        dinamicArray.add("asdf");
        System.out.println(dinamicArray);
    }
}
class GenExam<T> {
    private int index = 0;
    private final int DEFAULT_SIZE = 10;
    private final double DEFAULT_LOAD = 0.75;
    public T[] array;
    public GenExam(){
        array = (T[])new Object[DEFAULT_SIZE];
    }
    public void add(T elem) {
        if (index >= array.length * DEFAULT_LOAD) {
            array = Arrays.copyOf(array, array.length + 10);
        }
        array[index++] = elem;
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
