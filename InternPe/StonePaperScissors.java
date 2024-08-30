import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Options for the game
        String[] options = {"Stone", "Paper", "Scissors"};

        // Main game loop
        while (true) {
            System.out.println("Enter your choice (Stone, Paper, Scissors). Type 'exit' to quit:");
            String userChoice = scanner.nextLine().trim();
            
            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate user input
            if (!isValidChoice(userChoice, options)) {
                System.out.println("Invalid choice. Please choose Stone, Paper, or Scissors.");
                continue;
            }

            // Get computer's choice
            String computerChoice = options[random.nextInt(options.length)];
            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }

    // Method to validate user input
    private static boolean isValidChoice(String choice, String[] options) {
        for (String option : options) {
            if (option.equalsIgnoreCase(choice)) {
                return true;
            }
        }
        return false;
    }

    // Method to determine the winner
    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice.toLowerCase()) {
            case "stone":
                return (computerChoice.equalsIgnoreCase("Scissors")) ? "You win!" : "You lose!";
            case "paper":
                return (computerChoice.equalsIgnoreCase("Stone")) ? "You win!" : "You lose!";
            case "scissors":
                return (computerChoice.equalsIgnoreCase("Paper")) ? "You win!" : "You lose!";
            default:
                return "Unexpected error.";
        }
    }
}
// 
