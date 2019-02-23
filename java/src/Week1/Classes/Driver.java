package Week1.Classes;

public class Driver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 7);
        Rectangle r2 = new Rectangle(10, 2, "Green");
        Rectangle r3 = new Rectangle(15, 12, "Red");

        r1.draw();
        r2.draw();
        r3.draw();

    }
}
