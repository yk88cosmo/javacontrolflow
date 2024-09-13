package variables;

public class NarrowTypeCasting {
    public static void main(String[] args) {
        // convert the value of double 100.04 to a long (64 bit)
        double d = 100.04;
        // explicitly typecast the value in d before storing it to variable l
        long l = (long)d;
        // explicitly typecast the value in l before storing it to variable i
        int i = (int)l;
        System.out.println("double value of d: " + d);
        System.out.println("long value of l: " + l);
        System.out.println("int value of i: " + i);
    }
}
