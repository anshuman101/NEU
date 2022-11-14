package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOfArray {

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
        System.out.println("Enter the size");
        size = scn.nextInt();
        int[] arr2 = new int[size];
        for(int i=0; i<size;i++)
        {
            System.out.println("Enter the array element"+(i+1));
            arr2[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(Intersection(arr,arr2)));
    }

    private static int[] Intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums2)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        for(int i: nums1)
        {
            if(map.containsKey(i)){
                arr.add(i);
                map.put(i,map.get(i)-1);
                if(map.get(i)==0)
                {
                    map.remove(i);
                }
            }
        }

        return arr.stream().mapToInt(i->i).toArray();
    }
}
