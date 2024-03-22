package MyPackage;

public class Loop {


    private void calculateTables(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
//                if (j == 9)
//                    break;
            }

        }
    }


    public static void main(String[] args) {

        Loop loop = new Loop();
        loop.calculateTables(1000000);
    }
}
