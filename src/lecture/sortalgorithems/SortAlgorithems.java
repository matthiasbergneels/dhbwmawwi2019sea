package lecture.sortalgorithems;

import java.sql.SQLOutput;

public class SortAlgorithems {

    private static int[] toSort = {90, 70, 50, 30, 80, 60};

    public static int[] bubblesort(int[] array){

        int j = array.length - 1;
        boolean swapped = false;

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
