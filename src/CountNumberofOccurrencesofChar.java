public class CountNumberofOccurrencesofChar {

    public static void main (String[] args){

        String str = "helloworld";

        int[] charArray = new int[256];
        for(int i=0; i<str.length();i++){

            charArray[str.charAt(i)] = charArray[str.charAt(i)]+1;
        }

        for(int j=0;j<256;j++){
            if(charArray[j]>=1)
            System.out.println("Each Character count" + charArray[j] +" "+ (char)(j));
        }


    }
}
