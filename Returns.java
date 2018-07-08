public class Returns {

  public static void main(String[] args) {

    int y = 10;
    y = change(20);
    System.out.println(y);

  }

  public static int change(int x){

    x *= 10;
    return x;

  }

}
