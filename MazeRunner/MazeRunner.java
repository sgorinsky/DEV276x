import java.util.*;

public class MazeRunner {

  public static Scanner console = new Scanner(System.in);
  public static Maze myMap = new Maze();

  public static void main(String[] args) {

    String name = intro();
    String move = "L";
    int count = 0;

    while (myMap.didIWin() != true && count < 100) {
    //ends game if won before 100 moves or couldn't finish the maze after 100 moves or can't move in any direction

      if (myMap.isThereAPit(move) == true) {

        navigatePit(move);
        count++;
        movesMessage(count);

      }

      move = userMove();
      count++;
      movesMessage(count);


    }

    if (count > 100) {

      System.out.println("Unfortunately, you didn't escape the maze in time. You lose.");

    } else if (myMap.didIWin() == true) {

      System.out.println("Congratulations, you escaped the maze in " + count + " moves. " + name + " wins!");

    }

  }

  public static String intro() {

    System.out.println("Welcome to the maze, brave adventurer. What is your name? ");
    String name = console.nextLine();

    System.out.println("Okay, " + name + ". The rules are as follows: to start, your map will look all like \".\"\'s, except for your current position, which is \"x\". ");
    System.out.println("Each wall and pit are represented as \"-\" and \"0\" on your map respectively. Pits require a running start to jump and pass. ");
    System.out.print("Should you choose not to jump over it, you must back up in order to attempt to jump over it again.");
    System.out.println(" And finally, now that you are aware of the maze's rules, you must stay alert and prepare yourself. Good luck, " + name + ".");
    myMap.printMap();
    System.out.println("---------------------------------------");

    return name;

  }

  public static String userMove() {
  //User inputs direction R, L, U, or D

    System.out.println("Choose a direction: Right, Left, Up, or Down (R, L, U, D)");
    String move = console.nextLine();
    move = move.toUpperCase();

    while (!move.equals("R") && !move.equals("L") && !move.equals("U") && !move.equals("D")) {
    // if move is not one of these characters, loop never ends

      System.out.println("You must input R, L, U, or D for Right, Left, Up or Down.");
      move = console.nextLine();
      move = move.toUpperCase();

    }

    //Checking for free spaces:
    if (move.equals("R")) {

      if (myMap.canIMoveRight() == true) {

      myMap.moveRight();
      System.out.println("You moved right.");
      myMap.printMap();

      } else {

        System.out.println("Sorry, you cannot move right.");
        myMap.printMap();
        return userMove();

      }
    } else if (move.equals("L")) {

      if (myMap.canIMoveLeft() == true) {

      myMap.moveLeft();
      System.out.println("You moved left.");
      myMap.printMap();

      } else {

        System.out.println("Sorry, you cannot move left.");
        myMap.printMap();
        return userMove();

      }

    } else if (move.equals("U")) {

      if (myMap.canIMoveUp() == true) {

      myMap.moveUp();
      System.out.println("You moved up.");
      myMap.printMap();

      } else {

        System.out.println("Sorry, you cannot move up.");
        myMap.printMap();
        return userMove();


      }

    } else if (move.equals("D")) {

      if (myMap.canIMoveDown() == true) {

      myMap.moveDown();
      System.out.println("You moved down.");
      myMap.printMap();

      } else {

        System.out.println("Sorry, you cannot move down.");
        myMap.printMap();
        return userMove();

      }

    } else {

      return userMove();

    }

    return move;

  }

  public static void navigatePit(String move) { //Uses string return from userMove to determine if there's a pit

    String jump = ""; //initializing String var jump

    System.out.println("There is a pit there. Do you wish to jump over it? (Y/N)");
    jump = console.nextLine();
    jump = jump.toUpperCase();

    while (!jump.equals("Y") && !jump.equals("N")) { //input must be Y or N

      System.out.println("Jump over the pit? Yes or no (Y/N).");
      jump = console.nextLine();
      jump = jump.toUpperCase();

    }

    if (jump.equals("Y")) {
      myMap.jumpOverPit(move);
      myMap.printMap();

    } else {

      myMap.printMap();

      }
    }

  public static void movesMessage(int moves) {

    System.out.println("You have moved " + moves + " times so far.");

    if (moves == 50) {

        System.out.println("Warning: you have made 50 moves. You have 50 moves remaining before the exit closes.");

    } else if (moves == 75) {

      System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");

    } else if (moves == 90) {

        System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");

    } else if (moves == 100) {

        System.out.println("Oh no! You took too long to escape, and now the exit is closed. You will spend the rest of eternity here, in this maze.");

    }

  }

}
