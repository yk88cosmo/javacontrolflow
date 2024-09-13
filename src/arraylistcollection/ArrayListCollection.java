package arraylistcollection;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // 1. declare an ArrayList of participants
        ArrayList<String> participants = new ArrayList<String>();

        // 2. another approach to declare an ArrayList of participants
        ArrayList<String> participants2 = new ArrayList<>();

        // 3. use the ArrayList.add() method to store data to the ArrayList
        participants.add("Angela");
        participants.add("Benny");
        participants.add("Patrick");
        System.out.println(participants);
        System.out.println(participants.size()); // size() method returns the size of the ArrayList

        // 4. use the ArrayList.remove() method to remove data elements from an ArrayList
        participants.remove("Benny");
        System.out.println(participants);
        System.out.println(participants.size());

        // 5. accessing elements of an array list
        System.out.println(participants.get(0));
        System.out.println(participants.get(1));

        // 6. use a loop to iterate through an ArrayList to print out its data
        for (int i = 0; i < participants.size(); i++){
            System.out.println(i+1 + ". " + participants.get(i));
        }

        // 7. change the name from Angela to Angelia
        participants.set(0, "Angelia");
        System.out.println(participants);

        // 8. challenge: use a for loop to change the name where the value "Angelia" occurs
        // use an if statement to determine if the index position of participants have the value "Angelia"
        // if so, change the name from Angelia to Angel
        for (int i = 0; i < participants.size(); i++){

            if(participants.get(i).isEmpty()) // built-in ArrayList method to check for null values
                continue;
            if(participants.get(i).equals("Angelia")){ // original: if(participants.get(i) == "Angelia")
                participants.set(i, "Angel");
            }
            System.out.println(participants);
        }

        // 9. ArrayList has other built-in methods to work with the data within it
        System.out.println(participants.contains("Angelia"));
    }
}
