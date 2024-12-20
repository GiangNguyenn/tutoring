package misc;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("misc/test.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String newStr = line.replaceAll("a", "b");
            System.out.println(newStr);
        }

        sc.close();
    }
}