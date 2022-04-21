import java.util.List;
import java.util.Scanner;

public class checkPalindram {

    public static void main(String[] args) {
        //intPalindram();
        stringPalindram();
    }

    public static void stringPalindram(){

        String hello = "pop";
        String reverse="";
        for(int i=hello.length();i>0;i--) {

            reverse = reverse + hello.charAt(i-1);
            //System.out.println("Reverse String is " + reverse);
        }
        System.out.println("Reverse String is " + reverse);
        if(hello.equals(reverse))
            System.out.println("String is palindram");

    }

    private static void intPalindram() {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int temp=0;
        int temp1= num;

        while(num>0){
            int reminder = num%10;
            System.out.println("Modulus of" + num%10+ "is" + reminder);
            temp = reminder + 10*temp;
            System.out.println("temp is " + temp);
            num= num/10;
        }
        if(temp1==temp)
            System.out.println("Given number is palindram");
    }
}
