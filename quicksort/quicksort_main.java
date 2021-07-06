package quicksort;

import java.util.Arrays;
import java.util.Scanner;

public class quicksort_main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("HOW MANY ELEMENTS WOULD YOU LIKE TO SORT?");
        int n = scan.nextInt(); // n = брой елементи за сортиране

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("INSERT ELEMENT [%d]: ", i);
            arr[i] = scan.nextInt();
        } // въвеждане на елементи един по един

        System.out.println("BEFORE SORTING : " + Arrays.toString(arr));
        // принт преди сортиране

        quicksort_methods.quickSort(arr,0,n-1);
        // сортиране

        System.out.println("AFTER SORTING : " + Arrays.toString(arr));
        // принт след сортиране
    }
}
