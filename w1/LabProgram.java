import java.util.Scanner;

public class LabProgram {

    public static void swapValues(int[] values){
        System.out.print(values[1] + " " + values[0] + " " + values[3] + " " + values[2]);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 4;
        int[] values = new int[NUM_VALS];

        for (int i = 0; i < NUM_VALS; ++ i){
            values[i] = scnr.nextInt();
        }

        swapValues(values) ;
        System.out.println();

    }
}