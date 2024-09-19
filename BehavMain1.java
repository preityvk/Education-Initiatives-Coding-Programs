/*A strategy pattern is a type of behavioral design pattern that enables runtime selection of an object's behavior.
Put more simply, you can create a family of algorithms, package them all, and make them convertible with The Strategy Pattern.
In accordance with this design, the algorithm may change without affecting the clients that utilize it. */

/*The Strategy pattern, which enables objects to alter their behavior at runtime, is demonstrated by this program. 
This sorting method demonstrates how to employ several sorting techniques (such as bubble sort, insertion sort, and quick sort) without changing the client code. */

import java.util.Arrays;
// Strategy interface
interface SortStrategy {
    // Method to sort the array
    void sort(int[] arr);
}

// Creating Concrete strategy classes
class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Array Sorting using bubble sort...");
        // Bubble sort implementation
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class InsertionSort implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Array Sorting using insertion sort...");
        // Insertion sort implementation
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                // Shift elements to the right
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the key element
            arr[j + 1] = key;
        }
    }
}

class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Array Sorting using quick sort...");
        // Quick sort implementation
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // Increment index and swap elements
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot element with the element at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

// Context class
class SortingAlgorithm {
    private SortStrategy sortStrategy;

    public SortingAlgorithm(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSortingStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] arr) {
        // Delegate sorting to the chosen strategy
        sortStrategy.sort(arr);
    }
}

// Client code
public class BehavMain1 {
    public static void main(String[] args) {
        int[] array = {102, 545, 222, 597, 453, 932, 123};
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm(new BubbleSort());
        sortingAlgorithm.sort(array);
        System.out.println("Final Sorted array: " + Arrays.toString(array));

        sortingAlgorithm.setSortingStrategy(new InsertionSort());
        sortingAlgorithm.sort(array);
        System.out.println("Final Sorted array: " + Arrays.toString(array));

        sortingAlgorithm.setSortingStrategy(new QuickSort());
        sortingAlgorithm.sort(array);
        System.out.println("Final Sorted array: " + Arrays.toString(array));
    }
}