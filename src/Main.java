/*
 * @author Tevfik Kesici
 * @since 19.06.2022
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = {4, 3, 1, 2, 5};
        // System.out.println("Result: " + smallest(A));
        System.out.println("Array: " + Arrays.toString(selectionSort(A)));
    }

    public static int smallest(int[] A) {
        int smallest = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
                A[i] = A[i - 1];
                A[i - 1] = smallest;
            }
        }
        return smallest;
    }

    public static int[] selectionSort(int[] A) {
        int key;
        int smallest;
        for (int i = 0; i < A.length - 1; i++) {
            key = A[i];
            smallest = A[i + 1];
            System.out.println("[---START---]");
            System.out.println("Array: " + Arrays.toString(A));
            System.out.println("Key: " + key);
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    if (A[j] < smallest) {
                        smallest = A[j];
                        A[j] = key;
                        A[i] = smallest;
                    }
                }
            }
            System.out.println("To replace: " + smallest);
            System.out.println("[---END---]\n");
        }
        return A;
    }
}
