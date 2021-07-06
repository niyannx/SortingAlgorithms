package bubblesort;
import java.util.Arrays;
import java.util.Scanner;

public class bubblesort_main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("HOW MANY ELEMENTS WOULD YOU LIKE TO SORT?");

        int n = scan.nextInt(); // n = брой елементи за сортиране

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("INSERT ELEMENT [%d]: ", i);
            arr[i] = scan.nextInt();
        }

        System.out.println("BEFORE SORTING : " + Arrays.toString(arr));
        // принт преди сортиране

         bubblesort_methods.bubbleSort(arr);
        // сортиране

        System.out.println("AFTER SORTING : " + Arrays.toString(arr));
        // принт след сортиране
    }
}
