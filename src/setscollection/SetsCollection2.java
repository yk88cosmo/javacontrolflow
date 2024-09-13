package setscollection;

import java.util.*;

public class SetsCollection2 {
    public static void main(String[] args) {
        // names
        Set<String> names = new HashSet<String>();

        names.add("Santiago");
        names.add("Andres");
        names.add("Emily");

        // add an array of names to a set (via for loop)
        String[] newNames = {"Jameson", "Benny", "Maggie"};
        for(int i = 0; i < newNames.length; i++){
            names.add(newNames[i]);
        }
        // print the names, including the new additions
        System.out.println(names);

        // print out the name one at a time
        for(String name: names){
            System.out.println(name);
        }
        // if the name "Andres" is found in names, change the value to "Andres (confirmed)"
        if(names.contains("Andres")){
           names.remove("Andres");
           names.add("Andres (confirmed)");
        }
        System.out.println(names);

        // another approach to loop through data
        Set<String> namesCopy = new HashSet<>(names);
        // use Set nameCopy's built-in method (forEach) to update names where name is "Jameson"
        namesCopy.forEach(name->{
            if(name.equals("Jameson")){
                names.remove(name);
                names.add(name + " (confirmed)");
            }
        });
        System.out.println(names);
    }
}
