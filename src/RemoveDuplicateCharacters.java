import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String str = "HelloH";
        LinkedHashSet<Character> hs = new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
        }

        System.out.println("Your HS is "+ hs);
        for(Character ch: hs){
            System.out.print(ch);
        }


    }
}
