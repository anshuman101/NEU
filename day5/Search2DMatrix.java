package day5;

import java.util.HashSet;
import java.util.Scanner;

public class Search2DMatrix {

    public static void main(String[] args) {
        int m = 0, n = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the m");
        m = scn.nextInt();
        System.out.println("Enter the n");
        n = scn.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for (int j=0; j<n;j++)
            {
                System.out.println("Enter the value arr["+i+"]["+j+"]: ");
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter the target");
        int target = 0;
        target = scn.nextInt();


        System.out.println(searchMatrix(arr,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int c = matrix[0].length;

        HashSet<Integer> set = new HashSet<>();
        for (int[] ints : matrix) {
            for (int j = 0; j < c; j++) {
                set.add(ints[j]);
            }
        }
        return set.contains(target);

    }
}
