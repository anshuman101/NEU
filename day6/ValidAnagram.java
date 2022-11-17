package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string s");
        String rNote = scn.nextLine();

        System.out.println("Enter the string t");
        String mag = scn.nextLine();
        System.out.println(isAnagram(rNote, mag));
    }

    public static boolean isAnagram(String s, String t) {

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
}
