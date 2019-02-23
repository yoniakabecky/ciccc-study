package Lab1;

public class Driver {
    public static void main(String[] args) {
        Model m1 = new Model("Susan", "Smith", 70, 120, true, false);
        Model m2 = new Model("Tiger", "Woods", 72,190);
        m1.printDetails();
        m2.printDetails();
        m1.displayModelDetails();
        m1.displayModelDetails(true);
        m1.displayModelDetails(false);
    }
}
