package arrays.easy;

import java.util.Scanner;

public class LeftRotateDPlace {
    public static void main(String args[]) {

        // Write code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        LeftRotateDPlace s = new LeftRotateDPlace();
        s.leftRotate(arr, n, d);
        for (int it : arr) {
            System.out.print(it+" ");
        }
    }

    private void leftRotate(int[] arr, int n, int d){
        // First approach TC = O(n+d), SC = O(d)
        // put in temp array till d
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // rotate dth place to front place
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }

        // put back temp elements to at the end of the original array
        // either j = 0 or n-d approach
        // if n = 7, d = 3 then 7-3 = 4
        for(int i = n-d; i < n; i++){
            arr[i] = temp[i - (n - d)];
        }

        //-----------------------------------------

        // Second approach O(2n)
        /*reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);*/
    }

    private void reverse(int[] arr, int start, int end){
        int temp;
        while(start <= end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
