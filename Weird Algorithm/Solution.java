import java.util.Scanner;

public class Solution{
  private static String weirdAlgorithm(long num){
    StringBuilder result = new StringBuilder();
    result.append(num + " ");
    while(num != 1){
      if(num % 2 == 0){
        num /= 2;
      } else {
        num *= 3;
        num += 1;
      }
      result.append(num);
      result.append(" ");
    }

    return result.toString();
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextInt();

    String result = weirdAlgorithm(num);
    System.out.println(result);

    sc.close();
  }
}