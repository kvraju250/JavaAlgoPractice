import java.util.Arrays;

public class EasyBubleSort {

    public static void main(String[] args){

        int[] arr = {4,3,2,1,0};
        if(arr.length<=0)
            System.out.println("Not a valid array to sort");
        else{

            for (int i=0;i<arr.length-1;i++){

                for(int j=0;j<arr.length-i-1;j++){

                    if(arr[j]>arr[j+1]){

                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1] = temp;


                    }
                }


            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
