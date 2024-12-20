package misc;

import java.util.Scanner;

public class PairedDataProcessing {

   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      String inputWord;

      int itemStock;

      inputWord = scnr.next();

      while (!inputWord.equals("finale")) {

         itemStock = scnr.nextInt();

         if (itemStock <= 30) {
            System.out.println(inputWord + ": reorder soon");
         }
         inputWord = scnr.next();
      }
   }

}
