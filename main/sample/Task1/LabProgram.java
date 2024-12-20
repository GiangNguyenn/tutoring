package sample.Task1;

import java.util.Scanner;

public class LabProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        int times = 0;
        String name;
        String colour;
        int size;

        System.out.println("Current stock list:");
        shop.printAllItems();

        while (times < 2) {
            System.out.println("");
            if (times == 0) {
                System.out.println("Add new item");
            } else {
                System.out.println("Add second item");
            }
            System.out.println("Please enter garment name:");
            name = sc.nextLine();
            System.out.println("Please enter garment colour:");
            colour = sc.nextLine();
            System.out.println("Please enter garment size:");
            size = sc.nextInt();
            sc.nextLine();

            Garment garment = new Garment(name, colour, size);
            shop.add(garment);
            times++;
        }
        System.out.println("Updated stock list:");
        shop.printAllItems();

    }
}
