package ifconditionexercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        if(age > 60){
            System.out.println("You have a discount of 55%");
        }else if(age < 5){
            System.out.println("You have a discount of 60%");
        }else {
            System.out.println("It cost 7 Euros.");
        }
    }
}
