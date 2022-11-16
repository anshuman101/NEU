package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        int target = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the target");
        target = scn.nextInt();

        System.out.println(generate(target));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList();

        for(int i=0; i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++)
            {
                if(j==i || j==0) {
                    row.add(1);
                }
                else{
                    row.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
            }
            result.add(row);

        }

        return result;
    }
}
