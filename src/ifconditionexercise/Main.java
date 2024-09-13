package ifconditionexercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sales;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your sales: ");
        sales = scanner.nextInt();
        if(sales >= 0 && sales < 1000){
            System.out.println("N/A");
        }else if(sales > 1000 && sales < 5000){
            System.out.println("Commission at 10%");
        }else if(sales > 5000 && sales < 10000){
            System.out.println("Commission at 20%");
        }else if(sales > 10000){
            System.out.println("Commission at 30%");
        }else{
            System.out.println("Invalid input");
        }
    }
}
