//Module 3 Exam: commenting out methods after I've completed their corresponding questions


public class MysteryProgram {

    /* public static void mystery(String foo, String bar, String zazz) {
        System.out.println(zazz + " and " + foo + " like " + bar);
    }
    public static void main(String[] args) {
        String foo = "peanuts";
        String bar = "foo";
        mystery(bar, foo, "John");
   }
}


public class MysteryProgram {
    public static void main(String[] args) {
        int x = 3;
        doubleMe(x);
        System.out.println("x doubled is " + x);
    }
    public static void doubleMe(int x) {
        x = x * 2;
    }
}

*/

  public static void main(String[] args) {

    // System.out.println(smallest(1, 2, 3)); // 1
    // System.out.println(lastDigit(1234)); // 4
    // System.out.println(makeFancy("JAVA")); // *J*J*J*J*
    // System.out.println(mystery(1)); //Stack overflow error
    // System.out.println(puzzle(22,11)); //11
    
  }

  /* public static int someCode(int a, int b, int c){
    if((a<b) && (b<c)) {
        return a;
    } else if ((a>=b) && (b>=c)) {
        return b;
    } else if ((a==b) || (a==c) || (b==c)) {
        return c;
    }
  } */ // Doesn't compile because it's possible to reach the end of this method without a return statement

  /* public static int puzzle(int i, int j) {
    if (i == j) {
        return 0;
    } else {
        return 1 + puzzle((i-2), (j-1));
    }
  } */

  /* public static int mystery (int x) {
    if (x == 5) {
        return x;
    } else {
        return mystery(x--) * 5;
    }
  } */

  /* public static String makeFancy(String s) {

      if (s.length() == 0) {
          return "*";
        }

        return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
      } */

  /* public static int lastDigit(int num) {
   return Math.abs(num % 10);
} */

  /* public static int smallest(int a, int b, int c) {

    return Math.min(Math.min(a, b), c);

  } */

}
