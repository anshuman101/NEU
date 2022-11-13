package day1;

import java.util.Scanner;

public class MaximumSubArray {

    public static void main(String[] args) {
        int size;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size");
        size = scn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size;i++)
        {
            System.out.println("Enter the array element : "+(i+1));
            arr[i] = scn.nextInt();
        }

        System.out.println(maximumSubArrayCalculator(arr));
    }

    private static int maximumSubArrayCalculator(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            sum = sum + j;
            if (max < sum) {
                max = sum;
            }
            if (sum <= 0) {
                sum = 0;
            }
        }

        return max;
    }
}
