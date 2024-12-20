package misc;

import java.util.Scanner;

public class NumCounts {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputData;

      inputData = scnr.nextInt();
      Boolean stop = false;
      while (!stop) {
         if (inputData > -35 && inputData < 15) {
            System.out.println(inputData + " passes");
         } else {
            System.out.println(inputData + " needs attention");
            stop = true;
         }

         if (scnr.hasNextInt()) {
            inputData = scnr.nextInt();
         }
      }
   }
}