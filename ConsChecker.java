class CheckPlease {
    String name;

    public void tryCheckPlease() {
        System.out.println("Hi! " + name);
    }

    CheckPlease() {
        System.out.println("Hi there!" + name);
    }
}

public class ConsChecker {
    public static void main(String[] args) {
        CheckPlease cp1 = new CheckPlease();
        cp1.name = "Dhruvraj";
    }
}
