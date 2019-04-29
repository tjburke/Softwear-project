/**
Name: cards
Description: Makes a deck of cards then shuffles
Created by tj burke
*/
import java.util.Scanner;
import java.util.Random;
public class    cards {

    public static void main(String[] args) {
		cards c = new cards();
String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades"};// Stores cards
 int n = SUITS.length * 12; // defines n
        String[] deck = new String[n];// creates new deck with lenght of n
        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < SUITS.length; j++) { // runs for  lenght of suits
                deck[SUITS.length*i + j] = i + " of " + SUITS[j];// assigns numbers up to 12 for each card
			}
		}
			c.shuffle(deck);// calls shuffle
			// print shuffled deck
					         for (int j = 0; j < deck.length; j++) { // runs for  lenght of deck
		            System.out.println(deck[j]);// prints each cards value
				}

}
         public static String[] shuffle(String[] deck){
					Random rnd = new Random();
				        for (int i = deck.length - 1;i>= 0;i--) {
				            int index = rnd.nextInt(i+1);
				            //swap
				            String temp = deck[index];
				            deck[index] = deck[i];
				            deck[i] = temp;
		        }
		        return deck;
	}
  }//end class
