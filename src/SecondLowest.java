import java.util.Scanner;

public class SecondLowest{

       public int findSecondLowest(int[] array){

        int low =Integer.MAX_VALUE;
        int secndlow = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++)
        {

            if(array[i]<low){
                secndlow=low;
                low=array[i];
            } else if(array[i]>low && array[i]<secndlow){

                secndlow= array[i];
            }


        }

        return secndlow;

    }

    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int array1 = sc.nextInt();
        int[] array ={1,4,5,7,8,-1};

        SecondLowest sh = new SecondLowest();
        int result= sh.findSecondLowest(array);
        System.out.println("Secondlowest value"+ result);

    }


}