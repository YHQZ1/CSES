import java.util.Scanner;
 
public class Solution {
  private static long increasingArray(int[] arr) {
    long moves = 0;
 
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        int difference = arr[i - 1] - arr[i];
        moves = moves + difference;
        arr[i] = arr[i] + difference;
      }
    }
    return moves;
  }
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int size = sc.nextInt();
    int[] arr = new int[size];
 
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
 
    long result = increasingArray(arr);
    System.out.println(result);
 
    sc.close();
  }
}