import java.util.Scanner;

public class SimpleBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        int volume = width * length * height;

        System.out.println("\nBox details:");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}
