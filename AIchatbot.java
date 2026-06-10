import java.util.Scanner;
public class AIchatbot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;

        System.out.println("AI Chatbot Started!");
        System.out.println("Type 'bye' to exit.\n");

        while(true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            if(userInput.equals("hello")) {
                System.out.println("Bot: Hi! How are you?");
            }
            else if(userInput.equals("how are you")) {
                System.out.println("Bot: I am fine!");
            }
            else if(userInput.equals("what is your name")) {
                System.out.println("Bot: I am Java AI Chatbot.");
            }
            else if(userInput.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}


