import java.util.Random;
import java.util.Scanner;


public class DiceRoll {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String response = "y";
		
		System.out.println("Welcome to the Grand Circus Casino!");
		

		
		do {
			//Ask the user for a number of sides for a pair of dice
			System.out.println("How many sides should each dice have? ");
			int inputSides = scnr.nextInt();
			
			//This needs to be added one everytime the user decides to roll the dice again
			int i = 1;
			System.out.println("Roll " + i);
			int num1 = roll(inputSides);
			int num2 = roll(inputSides);
			System.out.println(num1);
			System.out.println(num2);
			
			System.out.println(gameMessage(num1, num2));
			
			System.out.println("Do you want to roll again? (y/n)");
			response = scnr.next();
			
			i++;
			
		} while (response.equalsIgnoreCase("y"));
		
		
	}

	public static int roll (int inputSides) {
		
		Random rand = new Random();
		int sides = rand.nextInt(inputSides);
		
		return sides + 1;
	
}
	
	public static String gameMessage (int num1, int num2) {
		
		String game;
		
		if (num1 == 1 && num2 == 1) {
			game = "Snake Eyes";
		} else if (num1 == 6 && num2 == 6) {
			game = "Box cars";
		} else if (num1 + num2 == 7 || num1 + num2 == 11) {
			game = "Craps";
		} else {
			return " ";
		}
		
		return game;
	}
}
