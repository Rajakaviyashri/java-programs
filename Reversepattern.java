package index1;

public class Reversepattern {
public static void main(String[] args) {
	  int rows = 5;
      for (int i = rows; i >= 1; i--) {
          for (int space = 0; space < rows - i; space++) {
              System.out.print("  "); // spacing
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }


}
}
