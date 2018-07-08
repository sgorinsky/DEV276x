/* Encrypting and decrypting caesar ciphers
*/
import java.util.Scanner;

public class CaesarCipher {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    System.out.println("Message you would like to encrypt: ");
    String t = console.nextLine();

    System.out.println("Input a number as the encryption key: ");
    int m = console.nextInt();

    System.out.println("Size of blocks in ciphertext: ");
    int n = console.nextInt();

    String ciphertext = Encrypt(t, m, n);
    String plaintext = Decrypt(ciphertext, m, n);

    System.out.println("Ciphertext: "+ ciphertext);
    System.out.println("Plaintext: " + plaintext);

  }

  public static String normalizeText(String s) { // remove all extra characters and make string uppercase

    s = s.replaceAll("[\\-\\+\\.\\'\\^:,\\s]","").toUpperCase(); //method to replace all punctuation and whitespace
    return s;

  }

  public static String groupify(String s, int n) { //breaks string up into n groups and pads end if length % n != 0

    String group = ""; //initializing empty string

    for (int i = 0; i < s.length()/n; i++) { //breaking up into groups and appending the substrings to an empty string

      String p = s.substring(i*n, (i+1)*n); //adds spaces to every multiple of block size
      group += (p + " ");

    }

    group+= s.substring(s.length() - s.length()%n, s.length()); //fills group with leftover characters not in last block

    if (s.length()%n != 0) { //check for string length as multiple of block size

      for (int j =0; j < n-s.length()%n; j++) { // n-s.length()%n = empty spaces leftover in last block

        group += 'x'; //pads with x's

      }
    }

    return group;

  }

  public static String caesarify(String t, int shift) { //shift character in string by corresponding index in alphabet

    String result = "";
    int addChar = 0;
    for (int i = 0; i < t.length(); i++) {

      char curr_char = t.charAt(i);

      curr_char += shift%26;
      addChar = (int) curr_char%26 + 65; // uppercase alphabet starts at character value 65
      curr_char = (char) addChar;


      result += (char) curr_char;

    }

    return result;

  }

  public static String Encrypt(String t, int m, int n) { //m as shift; n as size of group

    t = normalizeText(t);
    t = groupify(t, n);
    return caesarify(t, m);

  }

  public static String ungroupify(String s, int n) {
  // the spaces in groupify became part of the cipher, so this takes them out

    String empty = "";
    char letter = 'A';
    for (int i=1; i < s.length(); i++) {

      if (i%(n+1) == 0) {
      //if the character at index i is divisible by n, then it's a space between groups


      } else {
      //we only add characters to the empty string at indexes that aren't spaces

        letter = s.charAt(i-1);
        empty += letter;

      }

    }

    return empty;
  }

  public static String Decrypt(String t, int n, int m) {

    t = ungroupify(t, m);
    t = caesarify(t, -n);

    for (int j =0; m <= j; j--) { //n is negative for decrypt method
    // removes padded characters if last char equals one before it

      if (t.charAt(t.length()+j) == t.charAt(t.length() + (j-1))) {

        t = t.substring(0, t.length()-(j-2));

      }

    }

    return t;

  }

}
