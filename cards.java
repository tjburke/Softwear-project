import java.util.Scanner;
public class    cards {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// creates scanner to get input from user

String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades"};

 // initialize deck
        int n = SUITS.length * 12;
        String[] deck = new String[n];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = i + " of " + SUITS[j];
            }
        }
        // shuffle
		        for (int i = 0; i < n; i++) {
		            int r = i + (int) (Math.random() * (n-i));
		            String temp = deck[r];
		            deck[r] = deck[i];
		            deck[i] = temp;
        }
        // print shuffled deck
		        for (int i = 0; i < n; i++) {
		            System.out.println(deck[i]);
        }
	}


  }//end class