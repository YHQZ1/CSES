import java.util.Scanner;

public class Solution {
  private static int missingNumber(int[] arr, int size) {
    int missing = 0;
    for (int i = 1; i <= size; i++) {
      missing += i;
    }

    for (int i = 0; i < arr.length; i++) {
      missing -= arr[i];
    }

    return missing;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] arr = new int[size - 1];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int result = missingNumber(arr, size);
    System.out.println(result);

    sc.close();
  }
}
