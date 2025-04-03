package day5.level3;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int x = sc.nextInt();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};
        int numOfCards = suits.length * ranks.length;

        String[] deck = initDeck(suits, ranks);
        String[] shuffledDeck = shuffleDeck(deck);
        String[][] players = distributeDeck(shuffledDeck, x);

        if (players != null) {
            printPlayers(players);
    }
    }

    public static String[] initDeck(String[] suits, String[] ranks){
        String[] deck = new String[suits.length * ranks.length];
        for(int i = 0;i < suits.length ;i++){
            for(int j = 0;j<ranks.length;j++){
                deck[suits.length*j + i] = ranks[j] +" of " + suits[i];
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck){
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public static String[][] distributeDeck(String[] deck, int x){
        if (deck.length % x != 0) {
            System.out.println("Cannot distribute " + deck.length + " cards to " + x + " players.");
            return null;
        }

        String[][] players = new String[x][deck.length / x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < deck.length / x; j++) {
                players[i][j] = deck[i * (deck.length / x) + j];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players){
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
