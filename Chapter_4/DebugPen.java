import java.util.Scanner;

public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        this.color = "black";
        this.point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Pen Customizer ===");

        System.out.print("Enter pen color: ");
        String userColor = scanner.nextLine();

        System.out.print("Enter pen point type: ");
        String userPoint = scanner.nextLine();

        DebugPen pen = new DebugPen(userColor, userPoint);

        System.out.println("\nYour Pen Details:");
        System.out.println("Color      : " + pen.getColor());
        System.out.println("Point Type : " + pen.getPoint());

        scanner.close();
    }
}
