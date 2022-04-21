public class SecondLowestFromArray {

    public static void main (String[] args){

        int[] array = {3,5};
        int low = Integer.MAX_VALUE;
        int secondlow = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){

            if(array[i]<low){
                secondlow=low;
                low=array[i];
            }else if(array[i]>low ){

                secondlow=array[i];
            }

        }

        System.out.println("lowest value" + low);
        System.out.println("Second lowest value" + secondlow);


        }



    }

