package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReshapeMatrix {

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

        int r=0, c=0;
        System.out.println("Enter the r");
        r = scn.nextInt();
        System.out.println("Enter the c");
        c = scn.nextInt();
        System.out.println(Arrays.deepToString(matrixReshape(arr,r,c)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {


        if(mat[0].length*mat.length != r*c)
            return mat;

        ArrayList<Integer> arr = new ArrayList<>();
        int[][] matNew = new int[r][c];

        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                arr.add(mat[i][j]);
            }
        }

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                matNew[i][j] = arr.get(0);
                arr.remove(0);
            }
        }

        return matNew;
    }
}
