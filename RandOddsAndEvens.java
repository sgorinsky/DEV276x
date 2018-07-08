/* Odds and evens against a computer */

import java.util.*;

public class RandOddsAndEvens {

	public static void main(String[] args) {

  	Scanner console = new Scanner(System.in);
    Random rand;

    System.out.println("Let's play a game of \"Odds and Evens.\"");
    System.out.println("Who is playing?");
    String name = console.nextLine();

    System.out.println("Do you wish to choose odds or evens?");
    String oddsOrEvens = console.nextLine();
    String computerChoice = "";
		int n = (rand.nextInt(2)%2);

		while (!oddsOrEvens.contains("odd") && !oddsOrEvens.contains("Odd") && !oddsOrEvens.contains("even") && !oddsOrEvens.contains("Even")) {

			System.out.println("Please input again: odds or evens.");
			oddsOrEvens = console.nextLine();

		}

    System.out.println("Choose a number from 0 to 5 inclusive."); //Player chooses number between 0 and 5
    int player = console.nextInt();

    while (player < 0 || player > 5) {

      System.out.println("Choose again. Your number must be between 0 and 5.");
      player = console.nextInt();

    }

    int computer = rand.nextInt(6); // Computer choosing a number
		System.out.println("Computer chose " + computer + ".");

    int result = (player + computer)%2; //Is the resulting sum odd or even?

    if (result == 1) { //Result of game

      if (oddsOrEvens.contains("o") || oddsOrEvens.contains("O")) {

        System.out.println("Nice job, " + name + ". You win!");

      } else {

        System.out.println("Sorry, " + name + ". Computer wins!");
      }

    } else {

      if (oddsOrEvens.contains("e") || oddsOrEvens.contains("E")) {

        System.out.println("Nice job, " + name + ". You win!");

      } else {

        System.out.println("Sorry, " + name + ". Computer wins!");
      }

    }

  }

}
