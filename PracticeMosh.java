package MyPackage;

import java.awt.*;

public class PracticeMosh {
    public static void main(String[] args) {
        int age = 29;

        PracticeMosh mosh = new PracticeMosh();
        System.out.println("Just mosh " + mosh);
        Point point1 = new Point(1, 2);
        Point point2 = point1; //we are coping the value from point1 to point2
        System.out.println("Just point2 " + point2);
        System.out.println();
        System.out.println("Before point1 " + point1);
        System.out.println("Before point1 " + point2);
        point2.x = 2;
        System.out.println("Java variables are defined by "+point1.x);
        System.out.println("Java variables are defined by "+point2.x);

        System.out.println("After " + point1);
        //        System.out.println(age);
    }
}
