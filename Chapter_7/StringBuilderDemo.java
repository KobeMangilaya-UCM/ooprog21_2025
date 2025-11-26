public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Barbara");
        StringBuilder address = new StringBuilder("6311 Hickory Nut Grove Road");

        System.out.println("Name: " + name);
        System.out.println("Name capacity: " + name.capacity());

        System.out.println("Address: " + address);
        System.out.println("Address capacity: " + address.capacity());

        name.setLength(20);
        address.setLength(20);

        System.out.println("\nAfter setting length to 20:");
        System.out.println("Updated name: " + name);
        System.out.println("Updated address: " + address);
    }
}
