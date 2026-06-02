import java.util.Scanner;

public class Solution {
  private static int repetitions(String dna) {
    int max = 1;
    int curr = 1;
    for (int i = 1; i < dna.length(); i++) {
      if (dna.charAt(i) == dna.charAt(i - 1))
        curr++;
      else
        curr = 1;
      max = Math.max(curr, max);
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String dna = sc.nextLine();

    int result = repetitions(dna);
    System.out.println(result);

    sc.close();
  }
}