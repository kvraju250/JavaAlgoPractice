import java.util.Arrays;

public class quickSortPractice {

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args){
        int[] inputtoquicksort = {3,1,4,6};
        System.out.println("aray size"+ inputtoquicksort.length);
        quickSortPractice.quickSort(inputtoquicksort,0,inputtoquicksort.length-1);

    }

}
