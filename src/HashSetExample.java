import java.util.LinkedHashSet;

public class HashSetExample{


    public static void main(String[] args){

        String str= "geeksforgeeks";
        char[] chararray = str.toCharArray();
        String substring = str.substring(1,str.length());
        String letterSubstring = str.substring(0,1);
        System.out.println("SubString "+letterSubstring);
        boolean exist = substring.contains(letterSubstring);
        System.out.println("Letter eixist"+ exist);

        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        int[] eachChar = new int [256];
        //System.out.println("Each Char"+eachChar[0]);
        for(int i=0; i<=str.length()-1;i++){
            hs.add(str.charAt(i));
            eachChar[str.charAt(i)] =eachChar[str.charAt(i)]+1;

        }

        System.out.println(hs);

        for(int j=0;j<256;j++){

            if(eachChar[j]==1) {
                System.out.println("First non repeted char is " + (char) (j));
                break;
            }
        }

    }

}