package MyPackage;


public class Break {

    private void lab() {
        int y = 10;
        label:
        {
            label1:
            {
                int x = 10;
                if (x == 10)
                    break label1;

            }
            System.out.println("Outside the label INNER  block");
            if (y == 10)
                break label;
        }

        System.out.println("Outside the label1 OUTER block");
    }

    public static void main(String[] args) {

//        for (int i = 0; i <= 10; i++) {
//            if (i == 4)
//                break;
//            System.out.println("Hi");
//        }
        Break aBreak = new Break();
        aBreak.lab();


    }
}
