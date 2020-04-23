package lecture.sortalgorithems;

import java.sql.SQLOutput;

public class SortAlgorithems {

    private static int[] toSort = {90, 70, 50, 30, 80, 60};

    public static int[] bubblesort(int[] array){

        int j = array.length - 1;
        boolean swapped = false;

        long startTime = System.currentTimeMillis();

        do{
            swapped = false;

            for(int i = 0; i < j; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                    swapped = true;
                }
            }
            j--;
        }while(swapped);

        long endTime = System.currentTimeMillis();

        System.out.println("BubbleSort Runtime: " + (endTime - startTime) + " ms");

        return array;
    }

    public static int[] selectionSort(int[] array){

        long startTime = System.currentTimeMillis();

        int marker = array.length - 1;

        while(marker > 0){
            int maxPos = 0;
            for(int i = 0; i <= marker; i++){
                if(array[i] > array[maxPos]){
                    maxPos = i;
                }
            }
            swap(array, maxPos, marker);
            marker--;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("SelectionSort Runtime: " + (endTime - startTime) + " ms");

        return array;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static void printArray(int[] array){
        System.out.print("Array-Ausgabe: ");
        for(int i : array){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Unsortiertes Array");
        printArray(toSort);

        int[] bubbleSortedArray = bubblesort(toSort.clone());

        System.out.println("Bubble Sorted Array");
        printArray(bubbleSortedArray);
    }
}
