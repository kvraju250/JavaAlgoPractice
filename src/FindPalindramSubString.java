public class FindPalindramSubString {

    public String logestPalindrome(String input){

        int start=0;
        int substrLen=0;
        for(int i=0;i<input.length();i++){

            int len1= findCenterforString(input,i,i);
            int len2= findCenterforString(input, i, i+1);
            System.out.println("Len1 is "+ len1);
            System.out.println("Len2 is "+ len2);
            int len= Math.max(len1, len2);
            System.out.println("Len is "+ len);
            if(len>substrLen){
                start = i-(len-1)/2;
                substrLen=len;
            }

        }


        return input.substring(start,start+substrLen);

    }

    private int findCenterforString(String input, int left, int right){

       while(left>=0 && right<input.length() && input.charAt(left)==input.charAt(right)){

           left--;
           right++;
       }
        return right-left-1;
    }

    public static void main(String[] args){
        FindPalindramSubString mtd = new FindPalindramSubString();
      String res = mtd.logestPalindrome("123321");
      System.out.println("Resut is "+res);

    }

}
