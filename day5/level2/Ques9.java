package day5.level2;

import java.util.Random;
import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int numGames = sc.nextInt();
        sc.nextLine();

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter your move (rock/paper/scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            System.out.println("Computer choice: " + computerChoice);

            String result = findWinner(playerChoice, computerChoice);
            System.out.println(result);

            if (result.equals("You win!")) {
                playerWins++;
            } else if (result.equals("Computer wins!")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        String[][] stats = getStats(playerWins, computerWins, draws);
        displayResults(stats);
    }

    public static String getComputerChoice() {
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        return choices[random.nextInt(3)];
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "It's a draw!";
        }

        if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static String[][] getStats(int playerWins, int computerWins, int draws) {
        String[][] stats = new String[2][2];

        double playerWinPercentage = ((double) playerWins / (playerWins + computerWins + draws)) * 100;
        double computerWinPercentage = ((double) computerWins / (playerWins + computerWins + draws)) * 100;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWinPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWinPercentage);

        return stats;
    }

    public static void displayResults(String[][] stats) {
        System.out.println("\nResults:");
        System.out.println("Player Wins: " + stats[0][0] + " - " + stats[0][1] + "%");
        System.out.println("Computer Wins: " + stats[1][0] + " - " + stats[1][1] + "%");
    }
}
