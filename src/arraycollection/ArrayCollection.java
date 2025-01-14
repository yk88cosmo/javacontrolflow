package arraycollection;

import java.util.Arrays;
import java.util.Collections;

public class ArrayCollection {
    public static void main(String[] args) {
        // determine the different approaches in declaring and initialising an array
        // 1.
        int[] myArray = new int[]{0, 1, 2};
        System.out.println(myArray.length); // output:3
        System.out.println(myArray[1]); // output:1

        // 2.
        int[] myArray2 = {0, 1, 2};
        System.out.println(myArray2.length); // output:3
        System.out.println(myArray2[1]); // output:1

        // 3.
        int myArray3[] = {0, 1, 2};
        System.out.println(myArray3.length); // output:3
        System.out.println(myArray3[1]); // output:1

        // 4.
        int[] myArray4 = new int[4]; // this is different, we are creating an array without initialised value
        System.out.println(myArray4.length); // output:4
        System.out.println(myArray4[1]); // output:0

        // 5. declare an array of floating point values
        float[] myFloatArray = new float[4];
        System.out.println(myFloatArray.length); // output:4
        System.out.println(myFloatArray[1]); // output:0

        // 6. declare an array of boolean values
        boolean[] myBooleanArray = new boolean[5];
        System.out.println(myBooleanArray.length); // output:5
        System.out.println(myBooleanArray[1]); // output:false
        System.out.println(Arrays.toString(myBooleanArray)); // output:[false, false, false, false, false]

        // 7. iterate through an array of data (using loops)
        char[] myCharArray = new char[]{'a', 'b', 'c'};
        for (int i = 0; i < myCharArray.length; i++){
            System.out.println(i+1 + ". " + myCharArray[i]);
        }

        // challenge statement: print out myCharArray in reverse order (c, b, a)
        for ( int i = myCharArray.length - 1; i >= 0; i--){
            System.out.println(myCharArray.length-i + ". " + myCharArray[i]);
        }

        // challenge statement: use for-each loop for an array
        for (char item: myCharArray){
            System.out.println("Each element in myCharArray: " + item);
        }

        // fill an array with a set of default values (other than 0 or false)
        int len = 10;
        int[] myClassScoreArray = new int[len];
        Arrays.fill(myClassScoreArray, 10);
        System.out.println(Arrays.toString(myClassScoreArray));

        // while there is a direct approach to sort an array of primitive data type in ascending order
        int[] myRandomArray = {1, 5, 3, 9};
        Arrays.sort(myRandomArray);
        System.out.println(Arrays.toString(myRandomArray)); // output: 1, 3, 5, 9

        // at this time, is no direct approach in sorting primitive types (e.g. int) in REVERSE ORDER
        // otherwise, the array to be created must hold object data types such as integer
        Integer[] myRandomIntegerArray = {2, 8, 4, 0};
        Arrays.sort(myRandomIntegerArray);
        System.out.println(Arrays.toString(myRandomIntegerArray)); // output: [0, 2, 4, 8]

        // with object types such as integer, a reverse sort can be applied
        Arrays.sort(myRandomIntegerArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(myRandomIntegerArray)); // output: [8, 4, 2, 0]
    }
}
