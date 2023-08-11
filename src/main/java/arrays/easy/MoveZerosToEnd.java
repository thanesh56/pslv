package arrays.easy;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        moveZeros(n, a);
        for (int it : a) {
            System.out.print(it + " ");
        }

    }

    public static int[] moveZeros(int n, int[] a) {
        // Write your code here.
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return a;

        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                swap(a, i, j);
                j++;
            }
        }
        return a;
    }

    private static void swap(int[] a, int start, int end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
