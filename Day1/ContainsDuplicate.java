package day1;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int size = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size");
        size = scn.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the element" + (i+1));
            arr[i] = scn.nextInt();
        }

        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] nums) {
        if(nums.length==1)
            return false;
        HashSet<Integer> set = new HashSet<>();
        for(int j: nums)
        {
            set.add(j);
        }
        return set.size()!=nums.length;
    }
}
