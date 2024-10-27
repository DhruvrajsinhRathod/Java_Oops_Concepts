class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("The colour of the pen is: " + colour);
        System.out.println("The type of the pen is: " + type);
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.colour = "Green";
        pen2.type = "Bold";
        pen2.write();
    }
}