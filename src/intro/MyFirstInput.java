package intro;

import java.util.Scanner;

public class MyFirstInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine(); // read input from user
        System.out.println("Your name is :" + name); // print out the name
    }
}
