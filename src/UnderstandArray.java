import java.util.*;
import java.lang.*;
import java.io.*;

public class UnderstandArray {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        int[] chars = new int[128];
for (int i=0; i<n;i++) {
    char c = s.charAt(i);
    System.out.println("Before"+ chars[c]);
    chars[c]=chars[c]+1;
    System.out.println("After"+chars[c]);
    System.out.println("at char"+chars[97]);
    System.out.println("at char"+chars[98]);
    System.out.println("at char"+chars[99]);
}

    }
}
