package day6;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string (rNote)");
        String rNote = scn.nextLine();

        System.out.println("Enter the string (mag)");
        String mag = scn.nextLine();
        System.out.println(canConstruct(rNote, mag));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length())
            return false;

        for(char ch : ransomNote.toCharArray())
        {
            int index = magazine.indexOf(ch);
            if(index!=-1)
                magazine = newString(magazine, index);
            else
                return false;
        }

        return true;

    }

    public static String newString(String str, int index){
        return str.substring(0, index) + str.substring(index+1);
    }
}
