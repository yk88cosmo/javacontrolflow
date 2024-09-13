package loops;

public class While {
    public static void main(String[] args){
        // init a variable called init with a value of 5
        int init = 5;

        // while loop will NOT run, as the condition as the start is not met (init == 5)
        while(init < 5){
            System.out.println("while loop output for init: " + init);
            init++;
        }

        // do-while loop Will run at least once, before checking the condition and stop from there
        do{
            System.out.println("do while loop for init: " + init);
        }while (init < 5);
    }
}
