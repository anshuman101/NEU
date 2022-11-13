package day2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

    public static void main(String[] args) {
        int m =0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        m = scn.nextInt();
        int[] arr1 = new int[m];
        for(int i=0; i<m; i++)
        {
            System.out.println("Enter element number " + (i+1));
            arr1[i] = scn.nextInt();
        }
        int n =0;
        System.out.println("Enter the size of second array");
        n = scn.nextInt();
        int[] arr2 = new int[n];
        for(int j=0; j<n; j++)
        {
            System.out.println("Enter element number " + (j+1));
            arr2[j] = scn.nextInt();
        }

        System.out.println(Arrays.toString(mergeSortedArray(arr1,m-n,arr2,n)));

    }

    private static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

        int i=0;
        int j =0;
        int k =0;
        int[] nums = new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                nums[k] = nums1[i];
                i++;
            }
            else{
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m) {
            nums[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            nums[k] = nums2[j];
            j++;
            k++;
        }

        nums1 = nums.clone();
        return nums1;
    }
}
