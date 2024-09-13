package setscollection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class SetsCollection1 {
    public static void main(String[] args) {
        // create a HashSet using the set interface
        Set<String> data = new HashSet<String>();
        System.out.println(data);

        // populate our data with some CS subjects
        data.add("HTML");
        data.add("CSS");
        data.add("JavaScript");
        data.add("Java");
        data.add("JavaScript"); // warning will occur for duplicate elements detect
        System.out.println(data); // data rendered is unsorted

        // to sort our data, use an ArrayList instead
        ArrayList<String> dataArrayList = new ArrayList<>();
        dataArrayList.add("Margaret");
        dataArrayList.add("Colin");
        dataArrayList.add("Richard");
        dataArrayList.add("Dave");
        System.out.println(dataArrayList);

        // sorting in a ArrayList (ascending and descending order)
        dataArrayList.sort(Comparator.naturalOrder());
        System.out.println(dataArrayList);
        dataArrayList.sort(Comparator.reverseOrder());
        System.out.println(dataArrayList);
    }
}
