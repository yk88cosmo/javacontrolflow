package intro;

public class ExampleString {
    public static void main(String[] args){ // JRE knows this is the start of the program
        String organisationOne = "Generation";
        String organisationTwo = "Google";

        int lengthOne = organisationOne.length();
        int lengthTwo = organisationTwo.length();

        System.out.println("Org 1 has a length of " + lengthOne);
        System.out.println("Org 2 has a length of " + lengthTwo);
    }
}
