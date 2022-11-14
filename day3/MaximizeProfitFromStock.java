package day3;

import java.util.Scanner;

public class MaximizeProfitFromStock {

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

        System.out.println(calculateMaxPossibleProfit(arr));
    }

    private static int calculateMaxPossibleProfit(int[] prices) {
        int maxToTheRight = 0;
        int maxDiff = 0;

        for(int j=prices.length-1; j>=0; j--)
        {
            if(prices[j] > maxToTheRight)
            {
                maxToTheRight = prices[j];
            }
            if(maxToTheRight - prices[j] > maxDiff )
            {
                maxDiff = maxToTheRight - prices[j];
            }
        }

        return Math.max(maxDiff, 0);
    }
}
