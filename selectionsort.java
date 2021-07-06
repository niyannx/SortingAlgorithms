import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {

        int[] myArray = {15, 33, 7, 58, 42, 16, 34, 1};
        System.out.println("BEFORE SORTING: " + Arrays.toString(myArray));
        int n = myArray.length;
        int currMinIDX = 0;
        int buff = 0;

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++) {
                if(myArray[currMinIDX] > myArray[j]){
                    currMinIDX = j;
                }
            }
            buff = myArray[i];
            myArray[i] = myArray[currMinIDX];
            myArray[currMinIDX] = buff;
        }
        System.out.println("AFTER SORTING: " + Arrays.toString(myArray));
    }
}
