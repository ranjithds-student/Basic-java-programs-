package MyPackage;

import java.util.*;// This import statement READABILITY IS LO'W
import java.util.Scanner;// This import statement READABILITY IS HIGH

public class DeclarationsAndModifiers {

    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something");

        try {
            x = scanner.nextInt();
            System.out.println("you entered " + x);

        } catch (Exception e) {
            System.out.println("Something wrong happened");

        }
    }


}

class SuperParent {

    public void display() {
        System.out.println("SuperParent Class");
    }
}

class ChildClass extends SuperParent {

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.display();
//    SuperParent superParent=new SuperParent();
//    superParent.display();
    }


}



