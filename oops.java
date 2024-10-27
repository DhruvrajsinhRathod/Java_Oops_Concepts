class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Hello World!");
    }

    public void colourPrint() {
        System.out.println("The colour of the pen is: " + colour);
    }

    public void typePrint() {
        System.out.println("The type of the pen is: " + type);
    }

}

class Student {
    String name;
    int age;

    public void infoPrint() {
        System.out.println("The name of student is: " + name);
        System.out.println("The age of student is: " + age);
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.colour = "Green";
        pen2.type = "Bold";

        // pen1.write();
        // pen1.typePrint();
        // pen1.colourPrint();

        // pen2.write();
        // pen2.typePrint();
        // pen2.colourPrint();

        Student s1 = new Student();
        s1.age = 15;
        s1.name = "Dhruvraj";
        s1.infoPrint();
    }
}