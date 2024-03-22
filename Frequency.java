package MyPackage;

/*
21/3/21 Frequency of number in an array

 */
public class Frequency {

    public static void main(String[] args) {
        int[] ar = new int[]{10, 20, 10, 10, 12, 20, 3, 3, 4};
        int[] visitedAr = new int[ar.length];


        System.out.println("Frequency of number in an array");

        System.out.println("The original array is ");

        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i] + " ");
        }
        System.out.println();

        int visited = -1;
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ar.length; j++) {

                if (ar[i] == ar[j]) {
                    count++;
                     /*
                 //wrong  i made mistake here by writing ar[j] = visited;
                   //Right one  instead of visitedAr[j]=visited;

               Because we need to put values to an vistedAr[]
               because default values were putting 0"int default" for non entered values
               */
                    visitedAr[j] = visited; /*
                    visitedAr[j] because instead of visitedAr[i] is "j"  is the next element comparing so
               */
                }
            }
            if (visitedAr[i] != visited) {
            /*

                Wrong i had wrote wrong
                 instead of putting the count values into the visiteadAr[]
                  i put into ar[] that was wrong
                ar[i] = count;

correct is visitedAr[i] =count;
                 */
                //visitedAr[i] = count;
                visitedAr[i] = count;
            }

        }

        for (int i = 0; i < visitedAr.length; i++) {
            // wrong     if (ar[i] != visited) {
//right
            if (visitedAr[i] != visited) {
//                System.out.println("Frequency of " + ar[i] + " : " + visitedAr[i]);
                System.out.println("Frequency of " + ar[i] + " : " + visitedAr[i]);
            }
        }
    }
}
