import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){

        int[] arrayofNums = {4,3,12};
        int searchNum = 12;
        Arrays.sort(arrayofNums);
        System.out.println("sorted array" + Arrays.toString(arrayofNums));

        int left =0;
        int right = arrayofNums.length-1;
        while(left<=right){

            int midpoint = left+(right-left)/2;

            System.out.println("Mid point is"+ midpoint);

            if(arrayofNums[midpoint]==searchNum){
                System.out.println("found at position" + midpoint);
                break;
            } else if(arrayofNums[midpoint]>searchNum){

                right=midpoint-1;

            } else{
                left = midpoint+1;
            }

        }


    }
}
