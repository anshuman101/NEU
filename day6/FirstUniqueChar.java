package day6;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueChar {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scn.nextLine();
        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
                map.put(s.charAt(i),1);
        }

        for(int i=0; i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
