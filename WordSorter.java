import java.util.Scanner;
import java.util.Arrays;

public class WordSorter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many words: ");
    int count = input.nextInt();

    String[] words = new String[count];

    for (int i = 0; i < count; i++) {
      words[i] = input.next();
    }

    // COPY arrays
    String[] arraySort = words.clone();
    String[] bubble = words.clone();

    // Built-in sort
    Arrays.sort(arraySort, String.CASE_INSENSITIVE_ORDER);

    // Bubble sort
    bubbleSort(bubble);

    // OUTPUT
    System.out.println("\nOriginal:");
    System.out.println(Arrays.toString(words));

    System.out.println("\nArrays.sort():");
    System.out.println(Arrays.toString(arraySort));

    System.out.println("\nBubble Sort:");
    System.out.println(Arrays.toString(bubble));

    input.close();
  }

  public static void bubbleSort(String[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {

        if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
          String temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }

      }
    }
  }
}