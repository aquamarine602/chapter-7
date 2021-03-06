package chapter_7;

import static java.lang.System.out;

public class Cards {

	public static void main(String[] args) {
		int[] deck = new int [52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King"};
		
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		for (int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		for (int i = 0; i < 5; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
		
		
	}

}
