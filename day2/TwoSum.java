package day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        int size = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size");
        size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size;i++)
        {
            System.out.println("Enter the array element"+(i+1));
            arr[i] = scn.nextInt();
        }
        int target = 0;
        System.out.println("Enter target");
        target = scn.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] nums,int target) {

        int[] indices = new int[2];
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i=0; i<nums.length;i++)
        {
            set.put(nums[i], i);
        }

        for(int i=0; i<nums.length;i++)
        {
            int num2 = target - nums[i];
            if(set.containsKey(num2) && set.get(num2)!=i)
            {
                indices[0] = i;
                indices[1] = set.get(num2);
                break;
            }
        }
        return indices;
    }
}
