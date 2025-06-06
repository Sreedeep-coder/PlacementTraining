package day07;
import java.util.*;
public class snakeandladdle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int position = 1;
        Map<Integer, Integer> snake = Map.of(99, 21, 70, 55, 52, 42);
        Map<Integer, Integer> ladder = Map.of(3, 22, 5, 8, 11, 26, 20, 29);
        System.out.println("🎮 Welcome to Snake and Ladder Game!");
        while (position < 100) {
            System.out.println("\nYou're on: " + position);
            System.out.print("Press Enter to roll the dice...");
            sc.nextLine();

            int dice = rand.nextInt(6) + 1;
            System.out.println("🎲 You rolled: " + dice);

            if (position + dice <= 100)
                position += dice;

            if (ladder.containsKey(position)) {
                System.out.println("🪜 Ladder! Climb up to " + ladder.get(position));
                position = ladder.get(position);
            } else if (snake.containsKey(position)) {
                System.out.println("🐍 Snake! Slide down to " + snake.get(position));
                position = snake.get(position);
            }

            System.out.println("👉 Current Position: " + position);
        }

        System.out.println("\n🎉 Congratulations! You reached 100!");
        sc.close();
    }
}
    
}
