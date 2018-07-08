// Trip Planner

import java.util.Scanner;

public class TripPlanner {
  public static void main(String[] args) {
    Greeting();
    Budget();
    TimeDifference();
    Area();
  }

  public static void Greeting() { //Greeting
    Scanner console = new Scanner(System.in);
    System.out.println("Hi, what is your name? ");
    String name = console.nextLine(); //Scans name in console
    System.out.println("Nice to meet you, " + name + ".");
    System.out.println("Where would you like to visit? ");
    String location = console.nextLine();
    System.out.println(location + ", it is!");
  }

  public static void Budget() { //Budget for trip
    Scanner console = new Scanner(System.in);
    System.out.println("How many days do you plan to travel? ");
    double travel = console.nextDouble(); //Scans in amount of travel days
    System.out.println("How much money in USD do you plan to spend on your trip? ");
    int dollars = console.nextInt(); //Amount of dollars planned to use
    System.out.println("What is the currency of the country you are visiting? ");
    String currency = console.next();
    System.out.println("For 1 USD, how many " + currency + " are there? ");
    double conversion = console.nextDouble(); //Conversion factor for foreign currency
    System.out.print("If you are travelling for " + travel + " days, then you will spend ");
    System.out.print((travel*24) + " hours or " + (travel*24*60) + " minutes there. "); // Travel time in hours and minutes
    System.out.println("Since your budget is $" + dollars + ", you will spend $" + dollars/travel + " per day.");
    System.out.println("That is " + dollars * conversion + " " + currency + " for the trip and ");
    System.out.print(dollars*conversion/travel + " " + currency + " per day."); //Dollars per day
  }

  public static void TimeDifference() {
    Scanner console = new Scanner(System.in);
    System.out.println(" What is the time difference?");
    int Difference = console.nextInt();
    System.out.print("This means that when it's midnight, at home it will be " + (0 + Difference)%24 + ":00 ");
    System.out.print("and when it's noon the time at home will be " + (12+ Difference) + ":00." );
  }

  public static void Area() {
    Scanner console = new Scanner(System.in);
    System.out.println(" What is the area of the country in square km?");
    int AreaKM = console.nextInt(); //Reads in area of country in KM
    System.out.println("In miles, that is " + AreaKM * (.621 * .621) + " mi^2.");
  }



}
