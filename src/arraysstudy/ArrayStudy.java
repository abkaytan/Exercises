package arraysstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStudy {
    public static void main(String[] args) {

        Integer [] array1 = new Integer[]{2,5,9,11,7};
        Integer[] array2 = new Integer[5];

        for(int i=0; i<array1.length ; i++){     // copying array to another array
            array2[i] = array1[i];
            System.out.println(array2[i]);
        }

        Integer[] array3 = new Integer[5];
        System.arraycopy(array1, 0, array3, 0, 5 );  // alternative copy array to another array
        for(int j : array3){
            System.out.print(j + " ");
        }
        System.out.println();

        List<Integer> arrayL = Arrays.asList(array2); // cast array to list
        System.out.println(arrayL);
        System.out.println(arrayL.get(2));

        System.out.println(Arrays.equals(array1, array2)); // Arrays.equals();

        Arrays.sort(array3);        // Arrays.sort();
        List<Integer> list2 = Arrays.asList(array3);
        System.out.println(list2);

        int var = Arrays.binarySearch(array3, 7);  // search an object in array
        if(var<0){System.out.println("array dont have this char");}
        else {
            System.out.println("index of char : " +var);
        }

        int[][] array4 = new int[3][3];        // create matris 2d array
        for(int k=0; k<array4.length; k++){
            for(int l=0 ; l<array4.length; l++){
                array4[k][l] = k+l;
                System.out.print(array4[k][l] + "\t");
            }
            System.out.println();
        }

        Arrays.fill(array2,1,3,0);  // Arrays.fill  -- including first index and up to second index
        List<Integer> list3 = Arrays.asList(array2);
        System.out.println(list3);

    }


}
