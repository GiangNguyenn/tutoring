package sample.Task3;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Yang", 12, "ds", Privilege.DIAMOND);
        System.out.println(customer.toString());

        Customer customer1 = new Customer("Yang", 12, "ds");
        System.out.println(customer1.toString());
    }
}
