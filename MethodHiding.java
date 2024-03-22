package MyPackage;
/*
//Method hiding
class Parent {
    public static void m1() {
        System.out.println("Parent");

    }
}

class Child extends Parent {
    public static void m1() {
        System.out.println("Child");
    }
}

public class MethodHiding {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();

        Child child = new Child();
        child.m1();

        Parent parent1 = new Child();
        parent1.m1();

    }


}
*/

class Parent {
    public void m1() {
        System.out.println("Parent ");
    }
}

class Child extends Parent {
    public void m1() {
        System.out.println("Child");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();

        Child child = new Child();
        child.m1();

        Parent parent1 = new Child();   //Method hiding because static methods
        parent1.m1();

    }
}