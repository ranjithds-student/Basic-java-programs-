package MyPackage;

public class CompoundInterest {
    static String s;

    static class A {
    }

    static class B extends A {

    }

    public static void main(String[] args) {
//        CompoundInterest c = new CompoundInterest();
        String s1 = new String("data");
        String s2 = new String("data");
//        System.out.println("a is instance of A ");
//        System.out.println(a instanceof A);
//
//        System.out.println("Present class  is instance of Object or not ");
//        System.out.println(c instanceof Object);
//        System.out.println(b instanceof A);


        if (s == null) {
            System.out.println("S is equal and has " + s);
        }
        System.out.println("Data present in the s1 and s2 comparision ");
        System.out.println(s1.equals(s2));


    }
}
