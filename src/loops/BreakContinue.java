package loops;

public class BreakContinue {
    public static void main(String[] args) {
        // use a break keyword in a for loop
        //for(int i = 0; i < 10; i++){
        //    if(i == 3) // if i == 3, break out of the loop
        //        break;
        //    System.out.println(i);
        //}

        // use a break keyword to exist a while loop
        //int count = 0;
        //while (count < 10){
        //    if (count == 3) // if i == 3, break out of the while loop
        //        break;
        //    System.out.println(count);
        //   count++; // without the stepper, the loop will be infinite
        //}
        // use a continue keyword to skip one iteration of a loop
        //for (int i = 0; i < 10; i++){
        //    if(i == 3)
        //        continue;
        //    System.out.println(i);
        //}

        // write the above statement in a while loop instead
        int i = 0;
        while (i < 10){
            if (i == 3) {
                i++; // stepper is still required before skipping the iteration (i == 3)
                continue;
            }
            System.out.println(i);
            i++; // stepper to increment the loop
        }
    }
}
