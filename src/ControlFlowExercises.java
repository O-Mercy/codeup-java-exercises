import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//
//        int i = 0;
//            do {
//            System.out.println(i);
//                 i += 2;
//        } while (i <= 100);

//            int i = 100;
//            do {
//                System.out.println(i);
//                i -= 5;
//            } while (i >= -10);

//            int i = 2;
//            do {
//                System.out.println(i);
//                i *= 2;
//            } while (i < 1000000);

//------For loops-----
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//            }

//        for (int i = 0; i <= 100; i +=2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= 10; i -= 5 ){
//            System.out.println(i);
//        }

//        for (int i = 2; i < 1000000; i *= 2 ) {
//            System.out.println(i);
//        }

//----------Fizzbuzz-------
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//    -----------Scanner-------
        Scanner scanner = new Scanner(System.in);
        boolean confirm;
        do {
            int userInt = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= userInt; i++) {
                int square = i * i;
                int cubed = i * i * i;
                System.out.println("%-7s|%-9s|%06s\n", i, square, cubed);
            }
            System.out.println("Continue? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");


        }while(confirm);
        System.out.println("Cool see you next time!");


//  ------------Grades----------

        do {
            System.out.println("Enter a numerical garde from 0 to 100: ");
            int userGrade = scanner.nextInt();

            if (userGrade >= 88 && userGrade <= 100) {
                System.out.println("A");
            }else if( userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            }else {
                System.out.println("F");
            }
            System.out.println("Continue? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y")
        }while(confirm);
        System.out.println("K, bye!");
    }

}


