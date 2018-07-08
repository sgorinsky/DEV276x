/* Odds and Evens Project
Creating a game where each player chooses to predict an outcome: odds or evens.
Each player then picks a number from 0 to 5. Depending on the resulting sum of
both players' numbers, the player who chose correctly wins. */

import java.util.Scanner;

public class OddsAndEvens {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.println("Let's play \"Odds or Evens.\" Who's playing? Player one: "); //Names
    String name_one = console.nextLine();
    System.out.println("And player two: ");
    String name_two= console.nextLine();

    System.out.println(name_one + ": odds or evens?");
    String player_one = console.nextLine();

    if (player_one.contains("o") || player_one.contains("O")) {
      player_one = "odd";
    } else {
      player_one = "even";
    }

    String player_two = "";

    if (player_one.equals("odd")) {
      player_two = "even";
      System.out.println("Then " + name_two + " is evens.");
    } else {
      player_two = "odd";
      System.out.println("Then " + name_two + " is odds.");
    }

    System.out.println(name_one + ": choose a number between 0 to 5 inclusive.");
    int number_one = console.nextInt();
    while (number_one < 0 || number_one> 5) {

      System.out.println("Please pick a number between 0 and 5.");
      number_one=console.nextInt();

    }

    System.out.println(name_two + ": choose a number between 0 to 5 inclusive.");
    int number_two = console.nextInt();
    while (number_two < 0 || number_two > 5) {

      System.out.println("Please pick a number between 0 and 5.");
      number_two = console.nextInt();

    }

    int result = (number_one + number_two)%2;

    if (result == 1) {

      System.out.println("Odds: ");

        if (player_one == "odds") {
          System.out.print(name_one + " wins!");
        }

        else {
          System.out.print(name_two + " wins!");
        }

    } else {

      System.out.println("Evens: ");

      if (player_one == "evens") {
        System.out.print(name_one + " wins!");
      }

      else {
        System.out.print(name_two + " wins!");
      }


    }

  }


}
