package day07;
import java.util.Scanner;

public class HandCricket {
    static Scanner sc = new Scanner(System.in);

    // Get player's input (1-6)
    static int playerInput() {
        int z;
        while (true) {
            System.out.print("Enter your number (1-6): ");
            z = sc.nextInt();
            if (z >= 1 && z <= 6) break;
            System.out.println("Invalid input. Try again.");
        }
        return z;
    }

    // Generate CPU's number (1-6)
    static int cpuInput() {
        return 1 + (int)(Math.random() * 6);
    }

    // Batting function
    static int bat(boolean isPlayer) {
        int runs = 0;
        while (true) {
            int batsman = isPlayer ? playerInput() : cpuInput();
            int bowler = isPlayer ? cpuInput() : playerInput();
            System.out.println((isPlayer ? "You" : "CPU") + " played: " + batsman);
            System.out.println((isPlayer ? "CPU" : "You") + " bowled: " + bowler);

            if (batsman == bowler) {
                System.out.println((isPlayer ? "You" : "CPU") + " are OUT!");
                break;
            } else {
                runs += batsman;
                System.out.println("Runs: " + runs);
            }
        }
        return runs;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Hand Cricket!");

        // Toss
        System.out.print("Toss! Choose Odd(1) or Even(2): ");
        int choice = sc.nextInt();
        System.out.print("Enter your number for toss (1-6): ");
        int playerToss = sc.nextInt();
        int cpuToss = cpuInput();
        int sum = playerToss + cpuToss;
        System.out.println("CPU chose: " + cpuToss);
        boolean playerWinsToss = (sum % 2 == 1 && choice == 1) || (sum % 2 == 0 && choice == 2);

        boolean playerBatsFirst;
        if (playerWinsToss) {
            System.out.print("You won the toss! Bat(1) or Bowl(2)? ");
            playerBatsFirst = sc.nextInt() == 1;
        } else {
            playerBatsFirst = Math.random() < 0.5;
            System.out.println("CPU won the toss and chose to " + (playerBatsFirst ? "bat" : "bowl") + " first.");
        }

        int playerScore, cpuScore;
        if (playerBatsFirst) {
            System.out.println("\nYou are batting first!");
            playerScore = bat(true);
            System.out.println("\nCPU is batting. Target: " + (playerScore + 1));
            cpuScore = bat(false);
        } else {
            System.out.println("\nCPU is batting first!");
            cpuScore = bat(false);
            System.out.println("\nYou are batting. Target: " + (cpuScore + 1));
            playerScore = bat(true);
        }

        System.out.println("\nFinal Scores:");
        System.out.println("You: " + playerScore);
        System.out.println("CPU: " + cpuScore);

        if (playerScore > cpuScore) {
            System.out.println("Congratulations! You win!");
        } else if (playerScore < cpuScore) {
            System.out.println("CPU wins! Better luck next time.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}