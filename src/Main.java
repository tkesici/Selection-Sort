/*
 * @author Tevfik Kesici
 * @since 19.06.2022
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = {4, 30, 101, 6, 45, 67, 7, 1, 2, 5, 99, 111, 34, 3};
        System.out.println("Done!     -> " + Arrays.toString(selectionSort(A)));
    }

    public static int[] selectionSort(int[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < A.length; j++) {
                if ((A[j] < A[smallest])) smallest = j;
            }
            System.out.println("Step " + (i + 1) + "   -> "
                    + Arrays.toString((A)));
            int temp = A[smallest];
            A[smallest] = A[i];
            A[i] = temp;

        }
        return A;
    }
}
