package arrays.data_structure.matrix;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pst = new PascalTriangle();
        // First Variation
        int r = 6;
        int c = 3;
        System.out.println("value of PascalTriangle, Where Row = " + r + ", and Column = " + c + ", is " + pst.nCr(r - 1, c - 1));

        // Second Variation
        int row = 5;
        System.out.println(row + " row of PascalTriangle = " + pst.nthRow(row));


        // Third Variation
        for (int i = 1; i <= 8; i++) {
            System.out.println("PascalTriangle for " + i + " first rows: ");
            List<List<Integer>> result = pst.getPascalTriangle(i);
            for (List<Integer> rows : result) {
                for (Integer col : rows) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }

    private List<List<Integer>> getPascalTriangle(int row) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= row; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }

    private List<Integer> generateRow(int row) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(ans);
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }

    public int nCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    private List<Integer> nthRow(int r) {
        List<Integer> ansRow = new ArrayList<>();
        for (int col = 1; col <=r; col++) {
            ansRow.add(nCr(r - 1, col - 1));
        }
        return ansRow;
    }
}
