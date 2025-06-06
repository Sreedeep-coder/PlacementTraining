package day07;
import java.util.*;
public class rockpappersissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"rock", "paper", "scissors"};
        String userChoice, computerChoice;
        int rounds = 3;

        System.out.println("🎮 Rock, Paper, Scissors - Best of 3!");

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.print("\nRound " + i + " - Enter rock, paper or scissors: ");
            userChoice = sc.next().toLowerCase();
            computerChoice = options[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Draw!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("✅ You win this round!");
                userWins++;
            } else {
                System.out.println("❌ Computer wins this round!");
                compWins++;
            }
        }

        // Final result
        System.out.println("\n🏁 Final Score - You: " + userWins + " | Computer: " + compWins);
        if (userWins > compWins)
            System.out.println("🎉 You won the game!");
        else if (compWins > userWins)
            System.out.println("💻 Computer won the game!");
        else
            System.out.println("🤝 It's a tie!");

        sc.close();
    }
}
    

