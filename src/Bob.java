import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean confirm;

        System.out.println("Would you like to initiate a conversation?");
        String initiate = sc.nextLine();
        do {
            if(initiate.equalsIgnoreCase("y")) {
                System.out.println("What would you like to ask Bob?");
                String input = sc.nextLine();

                if (input.contains("?")) {
                    System.out.println("Sure");
                }else if(input.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if(input.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                }else {
                    System.out.println("Whatever.");
                }
            }else {
                break;
            }
            System.out.println("Continue [y/n]");
            confirm = sc.nextLine().equalsIgnoreCase("y");

        }while(confirm);
        System.out.println("Good chat!");
    }
}
