package revision;

public class SuburbTest{
    public static void main(String[] args){
        /**
         * Sample code has been provided as starting point to test your implementation.
         *
         * IMPORTANT: This code will not compile until you write the classes and enum being used here.
         * You may modify this code for faster testing purposes and exploration, but your assessment is
         * evaluated through the use of unit tests, so you need to ensure that the classes/enum you write
         * comply with the requirements setout in the documentation.
         *
         * Adding undocumented methods to your classes will mean that
         * the unit tests may fail.
         */

//         UNCOMMENT THE CODE BELOW ONCE YOU HAVE WRITTEN YOUR CODE TO TEST YOUR IMPLEMENTATION
         Suburb suburb1 = new Suburb("Carlton North", "Melbourne", State.VICTORIA, "3054");
         Suburb suburb2 = new Suburb("Henley Beach", "Adelaide", State.SOUTH_AUSTRALIA, "5379");
         System.out.println(suburb1);
         System.out.println(suburb2);

    }
}