import java.util.Scanner;

public class Circle {
    private int radius;

    // Constructor
    public Circle(int radius) {
        if (radius < 0) {
            System.out.println("Radius cannot be negative. Setting radius to 0.");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int r = scanner.nextInt();

        Circle circle = new Circle(r);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.printf("Area: %.2f%n", circle.getArea());

        scanner.close();
    }
}
