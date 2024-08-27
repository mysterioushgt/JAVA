package Array;

import java.util.*;

public class largestarray {
  public static int getlargest(int numbers[]) {
    int largest = 89;
    int smallest = 100;
    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      } else if (smallest > numbers[i]) {
        smallest = numbers[i];
      }
    }
    System.out.println("smallest no is" + smallest);
    return largest;
  }

  public static void main(String[] args) {
    int numbers[] = { 10, 89, 3, 45, 100, 8 };
    System.out.println("largest no is" + getlargest(numbers));
  }
}
