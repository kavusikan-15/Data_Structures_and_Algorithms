import java.util.*;

class Main {
  public static void main (String[] args) {
    //pattern(2);
    pattern4(3);
  }

  static void pattern(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  } 
  
  static void pattern1(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n-row+1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  } 

  static void pattern3(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int row = 0; row < 2 * n; row++) {
      int totalColsInRow = row > n ? 2 * n - row: row;
      for (int col = 0; col < totalColsInRow; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  
}
