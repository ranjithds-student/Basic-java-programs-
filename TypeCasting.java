package MyPackage;

public class TypeCasting {

    private void implicitTypeCast() {
        System.out.println("Implicit OR Automatic TypeCasting");
        byte x = 1;
        int y = x + 1;
        System.out.println(y);
        System.out.println("Implicit or automatic conversion happens from smaller type to bigger type in java ");
    }

    private void explicitTypecast() {
        System.out.println("Explicit Typecasting ");
        double x = 1.1;
        int y = (int) x + 1;
        System.out.println(y);
    }

    private void wrapperClass() {
        System.out.println("Wrapper Classes from String to numerical");
        String s = "1";
        int i = Integer.parseInt(s) + 1;

        System.out.println("int wrapper class is Integer to convert String to int");

        String n = "1.1";
        double v = Double.parseDouble(n) + 1.1;
        System.out.println("String converted into float " + v);

    }

    public static void main(String[] args) {
        System.out.println("Typecasting \n byte > short > int > long > float > double");
        TypeCasting casting = new TypeCasting();
        casting.implicitTypeCast();
        casting.explicitTypecast();
        casting.wrapperClass();
    }
}
