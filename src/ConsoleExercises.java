import java.util.Scanner;
//Copy this code into your main method:
//
//        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
//
//        The value of pi is approximately 3.14.
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);


//  Prompt a user to enter a integer and store that value in an int variable using the nextInt method
//  What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");


//  Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//  What happens if you enter less than 3 words?
//  What happens if you enter more than 3 words?
        System.out.println("Enter 3 words: ");
        String FirstWord = scanner.next();
        String SecondWord = scanner.next();
        String ThirdWord = scanner.next();
        System.out.print("Your three words are: \n" + FirstWord + "\n" + SecondWord + "\n" + ThirdWord + "\n");



//  Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//  do you capture all the words?
//  Rewrite the above example using the nextLine method.
//        System.out.println("Enter a Sentence: ");
//        String Sentence1 = scanner.next();
//        System.out.println("You entered: \n" + Sentence1);

        System.out.println("Enter a Sentence: ");
        String Sentence1 = scanner.nextLine();
        System.out.println("You entered: \n" + Sentence1);



//  Calculate the perimeter and area of Codeup's classrooms.
//  Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//  Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//  Assume that the rooms are perfect rectangles.
//  Assume that the user will enter valid numeric data for length and width.
//  Display the area and perimeter of that classroom.
//
//  The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
System.out.print("Enter length of classroom: ");
String lengthInput = scanner.nextLine();
System.out.print("Enter width of room: ");
String widthInput = scanner.nextLine();

double length = Double.parseDouble(lengthInput);
double width = Double.parseDouble(widthInput);

double area = length * width;
double perimeter = 2 * (length + width);

System.out.println("Area of the classroom is: " + area);
System.out.println("Perimeter of classroom is: " + perimeter);

//  In your perimeter/area calculator:
//
//  Accept decimal entries.
//  Calculate the volume of the rooms in addition to the area and perimeter.
//  The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//  scanner.useDelimiter("\n");
//  How does this change the way your program operates?
//
//  Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
        scanner.useDelimiter("\n");
        System.out.print("Enter the length of the classroom (decimal): ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the classroom (decimal): ");
        width = scanner.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);
        double volume = length * width * 10; // Assuming a height of 10 for volume

        System.out.println("Area of the classroom: " + area);
        System.out.println("Perimeter of the classroom: " + perimeter);
        System.out.println("Volume of the classroom: " + volume);

        scanner.close();
    }
}
