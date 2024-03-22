package MyPackage;

public class StaticClass {

    String name;
    int rollNumber;
    static String collegeName = "AIT";

    StaticClass(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    private void display() {
        System.out.println("Name : " + name + "  Roll Number : " + rollNumber + " College Name : " + collegeName);
    }

    public static void main(String[] args) {

        System.out.println("Static Program");
        StaticClass s1 = new StaticClass("Ranjith", 13);// Arguments
        StaticClass s2 = new StaticClass("Rahul", 11);
        s1.display();
        s2.display();
    }
}
