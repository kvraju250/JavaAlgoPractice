import java.util.*;

public class SecondMostRepeatedChar {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        String str;
        System.out.println("Enter your String:");
        str=cs.nextLine();

        int i,max=0,sec_max=0;
        int arr[]=new int[50];
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                System.out.println("Your inital value"+arr[str.charAt(i)]);
                arr[str.charAt(i)]=arr[str.charAt(i)]+1;
            System.out.println("Your string value"+ str.charAt(i));
            System.out.println("Your letter value"+arr[str.charAt(i)]);
        }
        for (i = 0; i <50; i++) {
            System.out.println("Your array value"+ i + " " + arr[i]);
            if (arr[i]>arr[max]) {
                System.out.println("Inside if loop"+ arr[max] +" " + arr[i]);
                sec_max=max;
                max = i;
            }
            else if(arr[i]>arr[sec_max] && arr[i]!=arr[max]){
                System.out.println("Inside if else loop"+ arr[max] +" " + arr[i]);
                sec_max=i;
            }
        }
        System.out.print("The Second Most occurring character in a string is "+(char)(sec_max));
        cs.close();
    }
}
