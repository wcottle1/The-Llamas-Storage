import java.util.*;
public class Blackjack {

	public static void main(String[] args) {

		displayInstructions();
		String option = "yes";
		int winCount = 0;
		do {
			
		Scanner in = new Scanner(System.in);
		System.out.print("\n\nPlayer draws two cards:");
	
		
		int aceCount = 0;
		int playerScore = 0;
		int dealerScore = 0;
		int nextCard = 0;
		String card1 = drawCard();
		String card2 = drawCard();
		String card3 = drawCard();
		String card4 = drawCard();
		
		System.out.print("\nCard 1: " + card1);
		System.out.print("\nCard 2: " + card2);
		
		System.out.print("\n\nDealer draws two cards:");
		
		System.out.print("\nCard 1: " + card3);
		System.out.print("\nCard 2: " + card4);
		
		nextCard = drawAnother();
	
		if (card1.contains("Ace")){
			aceCount++;
		}
		if (card2.contains("Ace")){
			aceCount++;
		}
		
		playerScore = score(aceCount, card1, card2, nextCard);
		dealerScore = score2(card3, card4);
		
		System.out.print(determineWinner(playerScore, dealerScore));
		String winner = determineWinner(playerScore, dealerScore);
		
		if(winner.contains("You won this turn! Good job!")) {
			winCount++;
		}
		System.out.print("\n\nYou currently have won " + winCount + " games.");
		
		System.out.print("\n\nDo you wish to play again? (yes or no)");
		option = in.nextLine();
		
		} while (option.contains("yes"));
		
		}
		
	

	public static void displayInstructions(){
		
		System.out.print("First, the dealer and player start with two cards."
				+ "\nThe goal of the game is to get as close to 21 points as possible."
				+ "\nHaving a card total of 21 points results in a win (unless the dealer has 21 points in which it is a draw)."
				+ "\nIf anyone goes over 21 points, they automatically lose."
				+ "\nif you and the dealer go over 21 points, it is a draw."
				+ "\nOtherwise, whoever gets closest to 21 wins!"
				+ "\nAces may either be 1 or 11. Good Luck!");
	}
	
	public static String drawCard(){
		
		String card1 = " ";
		int c1 = (int) Math.ceil(Math.random() * 13);
		switch (c1){
		
		case 1: {
			card1 = "Ace";
			break;
		}
		case 2: {
			card1 = "2";
			break;
		}
		case 3: {
			card1 = "3";
			break;
		}
		case 4: {
			card1 = "4";
			break;
		}
		case 5: {
			card1 = "5";
			break;
		}
		case 6: {
			card1 = "6";
			break;
		}
		case 7: {
			card1 = "7";
			break;
		}
		case 8: {
			card1 = "8";
			break;
		}
		case 9: {
			card1 = "9";
			break;
		}
		case 10: {
			card1 = "10";
			break;
		}
		case 11: {
			card1 = "Jack";
			break;
		}
		case 12: {
			card1 = "Queen";
			break;
		}
		case 13: {
			card1 = "King";
			break;
		}

		}
		return card1;
	}
	
	public static int drawAnother(){
		
		Scanner in = new Scanner(System.in);
		int card3 = 0;
		String nextCard = " ";
		String choice = "yes";
		
		while (choice.contains("yes")) {
		
		System.out.print("\n\nWould you like to draw another card? (yes or no) ");
		choice = in.nextLine();
		choice = choice.trim();
		
		if(choice.contains("yes")){
			nextCard = drawCard();
			System.out.print("You drew a(n) " + nextCard);
			
			switch (nextCard){

			case "Ace": {
				System.out.print("Would you like the ace to be 1 or 11?");
				card3 = in.nextInt();
				break;
			}
			case "2":{
				card3 = 2;
				break;
			}
			case "3":{
				card3 = 3;
				break;
			}	
			case "4":{
				card3 = 4;
				break;
			}
			case "5":{
				card3 = 5;
				break;
			}
			case "6":{
				card3 = 6;
				break;
			}
			case "7":{
				card3 = 7;
				break;
			}
			case "8":{
				card3 = 8;
				break;
			}
			case "9":{
				card3 = 9;
				break;
			}
			case "10":{
				card3 = 10;
				break;
			}
			case "Jack":{
				card3 = 10;
				break;
			}
			case "Queen":{
				card3 = 10;
				break;
			}
			case "King":{
				card3 = 10;
				break;
			}
			
			
			
		}
		}
		
		}
		return card3;
	}
	
	public static int score(int aceCount, String c1, String c2, int c3){
	
		int aceValue = 0;
		int card1 = 0;
		int card2 = 0;
		int card3 = 0;
		int score = 0;
		
		switch (c1){
		case "Ace": {
			break;
		}
		case "2":{
			card1 = 2;
			break;
		}
		case "3":{
			card1 = 3;
			break;
		}
		case "4":{
			card1 = 4;
			break;
		}
		case "5":{
			card1 = 5;
			break;
		}
		case "6":{
			card1 = 6;
			break;
		}
		case "7":{
			card1 = 7;
			break;
		}
		case "8":{
			card1 = 8;
			break;
		}
		case "9":{
			card1 = 9;
			break;
		}
		case "10":{
			card1 = 10;
			break;
		}
		case "Jack":{
			card1 = 10;
			break;
		}
		case "Queen":{
			card1 = 10;
			break;
		}
		case "King":{
			card1 = 10;
			break;
		}
		
		}
switch (c2){
		
		case "Ace": {
			break;
		}
		case "2":{
			card2 = 2;
			break;
		}
		case "3":{
			card2 = 3;
			break;
		}
		case "4":{
			card2 = 4;
			break;
		}
		case "5":{
			card2 = 5;
			break;
		}
		case "6":{
			card2 = 6;
			break;
		}
		case "7":{
			card2 = 7;
			break;
		}
		case "8":{
			card2 = 8;
			break;
		}
		case "9":{
			card2 = 9;
			break;
		}
		case "10":{
			card2 = 10;
			break;
		}
		case "Jack":{
			card2 = 10;
			break;
		}
		case "Queen":{
			card2 = 10;
			break;
		}
		case "King":{
			card2 = 10;
			break;
		}
		
		}

		card3 = c3;

	//getting the ace count gathered and taking their values
	if (aceCount > 0){
		
		Scanner in = new Scanner(System.in);
		System.out.print("You have " + aceCount + " aces.");
		
		switch (aceCount){
		
		case 1: {
			System.out.print("\nWould you like Ace 1 to be counted as 1 or 11?");
			aceValue = in.nextInt();
			break;
		}
		case 2: {
			System.out.print("\nWould you like Ace 2 to be counted as 1 or 11?");
			aceValue += in.nextInt();
			break;
		}
		case 3:
			System.out.print("\nWould you like Ace 3 to be counted as 1 or 11?");
			aceValue += in.nextInt();
			break;
		}
	}
		
	score = card1 + card2 + card3 + aceValue;	
	return score;
	
	}	
	
	public static String determineWinner(int s1, int s2) {
		
		System.out.print("\n\nYour score is: " + s1);
		System.out.print("\nThe dealer's score is: " + s2);
		
		if ((s1 > s2) && (s1 <= 21)){
			return "\n\nYou won this turn! Good job!";
		}
		else if ((s1 > s2) && (s2 > 21)){
			return "\n\nUnfortunately, this is a tie!";
		}
		else if (s1 == s2){
			return "\n\nUnfortunately, this is a tie!";
		}
		else if ((s1 < s2) && (s1 <= 21) && (s2 > 21)){
			return "\n\nYou won this turn! Good job!";
		}
		else if ((s1 < s2) && (s2 <= 21)){
			return "\n\nThe dealer won this turn.";
		}
		else if ((s1 > 21) && (s2 <= 21)){
			return "\n\nThe dealer won this turn.";
		}
		else if ((s1 < s2) && (s2 > 21)){
			return "\n\nUnfortunately, this is a tie!";
		}
		
		return "\n\nSomething went wrong...";
	}
	
	public static int score2(String c1, String c2){
		
		int card3 = 0;
		int card1 = 0;
		int card2 = 0;
		int score = 0;
		
		switch (c1){
		case "Ace": {
			card1 = 1;
			break;
		}
		case "2":{
			card1 = 2;
			break;
		}
		case "3":{
			card1 = 3;
			break;
		}
		case "4":{
			card1 = 4;
			break;
		}
		case "5":{
			card1 = 5;
			break;
		}
		case "6":{
			card1 = 6;
			break;
		}
		case "7":{
			card1 = 7;
			break;
		}
		case "8":{
			card1 = 8;
			break;
		}
		case "9":{
			card1 = 9;
			break;
		}
		case "10":{
			card1 = 10;
			break;
		}
		case "Jack":{
			card1 = 10;
			break;
		}
		case "Queen":{
			card1 = 10;
			break;
		}
		case "King":{
			card1 = 10;
			break;
		}
		
		}
switch (c2){
		
		case "Ace": {
			card2 = 1;
			break;
		}
		case "2":{
			card2 = 2;
			break;
		}
		case "3":{
			card2 = 3;
			break;
		}
		case "4":{
			card2 = 4;
			break;
		}
		case "5":{
			card2 = 5;
			break;
		}
		case "6":{
			card2 = 6;
			break;
		}
		case "7":{
			card2 = 7;
			break;
		}
		case "8":{
			card2 = 8;
			break;
		}
		case "9":{
			card2 = 9;
			break;
		}
		case "10":{
			card2 = 10;
			break;
		}
		case "Jack":{
			card2 = 10;
			break;
		}
		case "Queen":{
			card2 = 10;
			break;
		}
		case "King":{
			card2 = 10;
			break;
		}
		
		}

	score = card1 + card2;
	
	while (score < 21){
		String c3 = drawCard();
		System.out.print("\nThe dealer drew a(n) " + c3);
		switch (c3) {
		
		case "Ace": {
			card3 = 1;
			break;
		}
		case "2":{
			card3 = 2;
			break;
		}
		case "3":{
			card3 = 3;
			break;
		}
		case "4":{
			card3 = 4;
			break;
		}
		case "5":{
			card3 = 5;
			break;
		}
		case "6":{
			card3 = 6;
			break;
		}
		case "7":{
			card3 = 7;
			break;
		}
		case "8":{
			card3 = 8;
			break;
		}
		case "9":{
			card3 = 9;
			break;
		}
		case "10":{
			card3 = 10;
			break;
		}
		case "Jack":{
			card3 = 10;
			break;
		}
		case "Queen":{
			card3 = 10;
			break;
		}
		case "King":{
			card3 = 10;
			break;
		}
		
		}
		score += card3;
	}
	
	return score;
	
	
	
	
	
	}
	}
	
	
	

