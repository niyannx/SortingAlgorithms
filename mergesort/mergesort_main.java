package mergesort;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort_main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("INPUT NUMBER OF ELEMENTS : ");
            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                System.out.println("INPUT ELEMENT " + i + " : ");
                arr[i] = scan.nextInt();
            }
            System.out.println("BEFORE MERGE SORT : " + Arrays.toString(arr));

            mergesort_methods.Divide(arr, 0, arr.length - 1);

            System.out.println("AFTER MERGE SORT : " + Arrays.toString(arr));
    }

}
