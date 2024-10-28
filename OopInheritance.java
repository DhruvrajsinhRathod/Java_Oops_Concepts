// import bank.*;

class Shape {
    String colour;
}

class Square extends Shape {
    public void squarePrinter() {
        System.out.println(colour);
    }
}

public class OopInheritance {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.colour = "RedSquare";
        s1.squarePrinter();

        bank.Account ba = new bank.Account();
        ba.customer1Printer();
    }
}
