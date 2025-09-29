import java.util.Scanner;

public class DebugFour2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color;
        String point;
        DebugPen pen1;
        DebugPen pen2;

        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();

        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

        pen1 = new DebugPen();
        pen2 = new DebugPen(color, point);

        System.out.println("Default value pen:");
        display(pen1);

        System.out.println("User value pen:");
        display(pen2);
    }

    public static void display(DebugPen p) {
        System.out.println(" The pen has ink color " + p.getColor());
        System.out.println(" and a " + p.getPoint() + " point.");
    }
}

class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}
