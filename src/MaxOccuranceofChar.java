public class MaxOccuranceofChar {

    public static void main (String[] args){

        String str = "Hellowworld";
        int max=0;
        char ch='0';

        int[] array = new int[256];

        for(int i=0;i<str.length();i++){
           array[str.charAt(i)] = array[str.charAt(i)]+1;
        }

        for(int i=0;i<256;i++){

            if(array[i]>max){
                max=array[i];
                ch = (char)i;
            }
        }
System.out.println("MaxOccuranceChar"+ ch );

    }
}
