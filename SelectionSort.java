package selectionsort;

public class SelectionSort {

  public static void main(String[] args) {
    int[] array = { 9, 5, 1, 8, 6, 3 };

    System.out.println("Array unsorted: ");
    for (int unsorted = 0; unsorted < array.length; unsorted++) {
      System.out.print(array[unsorted] + "| ");
    }
    System.out.println();

    int[] assortedSeries = selectionSort(array);

    System.out.println("Array sorted: ");
    for (int sorted = 0; sorted < assortedSeries.length; sorted++) {
      System.out.print(assortedSeries[sorted] + "| ");
    }
  }

  public static int[] selectionSort(int[] sort) {
    for (int a = 0; a < sort.length - 1; a++) { //9
      for (int s = a + 1; s < sort.length; s++) { //5
        if (sort[s] < sort[a]) { //5 is less than 9 Yes!
          int cache = sort[a]; //9
          sort[a] = sort[s]; //5
          sort[s] = cache; //9
        }
      }
    }
    return sort;
  }
}
