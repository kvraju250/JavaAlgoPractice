import java.util.*;
import java.lang.*;
import java.io.*;
class LongestSubString {

    public int lengthOfLongestSubstring(String s) {

        int n= s.length();
        int res=0;

        for(int i=0; i<n;i++)
        {
            for (int j=i;j<n;j++){

                boolean res1 = checkRepetition(s, i, j);

                if(res1){
                    res = Math.max(res,j-i+1);
                }
            }
        }

       return res;
    }


        public String findSubString(String s) {

        int n= s.length();
        String sres="";

        for(int i=0; i<n;i++)
        {
            for (int j=i;j<n;j++){

                boolean res1 = checkRepetition(s, i, j);

                if(res1){
                    sres = s.substring(i,j); // Math.max(res,j-i+1);
                }
            }
        }

        return sres;
    }

    private boolean checkRepetition(String s, int start, int end) {
        int[] countChars = new int[128];
        for(int k=start;k<=end;k++){

            char c= s.charAt(k);
            countChars[c]=countChars[c]+1;
            if(countChars[c]>1){
                return false;
            }

        }
            return true;
    }
    public static void main(String args[]) {
        // Your code goes here
        LongestSubString ob = new LongestSubString();
        String s = "Heello";
        int res= ob.lengthOfLongestSubstring(s);
        System.out.println(res);
        String sres= ob.findSubString(s);
        System.out.println("value "+sres);
    }
}