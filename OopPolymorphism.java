class PolyStudent {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class OopPolymorphism {
    public static void main(String[] args) {
        PolyStudent ps1 = new PolyStudent();
        ps1.printInfo(12);
        ps1.printInfo("Dhruvraj");
        ps1.printInfo("Rathod", 15);;
    }
}
