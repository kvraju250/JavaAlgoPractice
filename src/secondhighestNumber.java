import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class secondhighestNumber {

    public Set<Integer> hashway(int[] num){
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        Set<Integer> hash_Set = new HashSet<Integer>();

        for (int i=0;i<num.length;i++)
            hash_Set.add(num[i]);
        System.out.println(hash_Set);
        return hash_Set;
    }

    public int secondLowest(int[] num){
        int lowvalue=Integer.MAX_VALUE;
        int secondlowvalue=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]<lowvalue){
                secondlowvalue=lowvalue;
                lowvalue=num[i];
            } else if(num[i]>lowvalue && num[i]<secondlowvalue)
            {
                secondlowvalue=num[i];
            }
        }

        return secondlowvalue;
    }

    public int secondHighest(int[] num){
        int lowvalue=Integer.MIN_VALUE;
        int secondlowvalue=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>lowvalue){
                secondlowvalue=lowvalue;
                lowvalue=num[i];
            } else if(num[i]<lowvalue && num[i]>secondlowvalue)
            {
                secondlowvalue=num[i];
            }
        }

        return secondlowvalue;
    }

        public static void main(String[] args) {
            System.out.println("Hello workd");
            int[] num = {1,5,-2,-5,-10,8,9,0,0,5};
            secondhighestNumber hashobject = new secondhighestNumber();
           hashobject.hashway(num);
            System.out.println("Second Lowest value " + hashobject.secondLowest(num));
            System.out.println("Second Highest value " + hashobject.secondHighest(num));

        }

    }

