/* Basic For Loop Practice
The format is as follows: (initialize variable; test condition; update variable)
for (int i = 10; i >= 20; i++) {
  System.out.println("This is a basic for loop")
}
*/

public class forLoops {
  public static void main(String[] args) {
    forLoop();
  }

  public static void forLoop() {
    for (int i = 10; i <= 15; i++) {
      System.out.println("We have " + (15-i) + " left.");
    }
  }
}
