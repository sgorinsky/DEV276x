//Boolean Practice
import java.util.Scanner;

public class Boolean {
  public static void main(String[] args) {
    System.out.println("my string" == "My String");
    Conditional();
  }

  public static void Conditional() {
    Scanner console = new Scanner(System.in);
    System.out.println("Input your grade, please.");
    Double grade = console.nextDouble();
    if (grade >= 65) {
      System.out.println("You pass!");
    } else if (grade > 55) {
      System.out.println("Almost, keep trying!");
    } else {
      System.out.println("Unfortunately, you failed.");
    }
  }
}

/*name.equals("John"); // too short
name.equals("john doe"); // case doesn’t match
name.equals("John Doe "); // extra space at end
name.equals("John  Doe "); // extra space in middle
*/
