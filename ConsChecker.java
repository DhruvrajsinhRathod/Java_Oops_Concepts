class CheckPlease {
    String name;

    public void tryCheckPlease() {
        System.out.println("Hi! " + name);
    }

    CheckPlease(String name, int age) {
        this.name = name;
        System.out.println("Hi there! " + name + age);
    }
}

public class ConsChecker {
    public static void main(String[] args) {
        CheckPlease cp1 = new CheckPlease("Dhruv", 21);
        cp1.name = "Dhruvraj";
        cp1.tryCheckPlease();
    }
}
