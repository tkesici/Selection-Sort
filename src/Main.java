/*
 * @author Tevfik Kesici
 * @since 19.06.2022
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = {4, 3, 1, 2, 5};
        System.out.println("Done! ->    " + Arrays.toString(selectionSort(A)));
    }

    public static int[] selectionSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int smallest = 2147483647;
            int position = 0;
            int temp = 0;
            System.out.println("A[i] = " + i + " -> " + Arrays.toString(A));
            for (int j = i + 1; j < A.length; j++) {
                if ((A[j] < smallest)) {
                    smallest = A[j];
                    position = j;
                }
                if (j == A.length - 1 && i == A.length - 2) {
                    if (A[i] > A[j]) {
                        smallest = A[j];
                        position = j;
                    } else {
                        smallest = A[i];
                        position = i;
                    }
                }
            }
            temp = A[i];
            A[i] = smallest;
            A[position] = temp;
        }
        return A;
    }
}
