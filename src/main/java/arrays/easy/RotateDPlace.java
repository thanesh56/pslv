package arrays.easy;

import java.util.Scanner;

public class RotateDPlace {
    public static void main(String args[]) {

        // Write code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        RotateDPlace s = new RotateDPlace();
        //s.leftRotate(arr, n, d);
        s.rightRotate(arr, n, d);

        for (int it : arr) {
            System.out.print(it+" ");
        }
    }

    private void rightRotate(int[] arr, int n, int d) {
        //arr[] = {1,2,3,4,5,6,7}, d = 3
        //ans a[]= {5,6,7,1,2,3,4}
        if(n==0) return;
        d = d % n;
        if(d > n) return;

        // First approach TC = O(n+d), SC = O(d)
        // put in temp array till d
        /*int[] temp = new int[d];
        for (int i = n - d; i < n; i++) { // 6, 7
            temp[i - (n - d)] = arr[i];
        }

        for (int i  = n - d - 1; i >= 0 ; i--) { // ......1,2,3,4,5
            arr[i + d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }*/


        //----------------------------
        // Second Approach (Optimal)
        // arr[] = {1,2,3,4,5, 6,7}, d = 2
        // revers(0, n-d-1)  = 5,4,3,2,1
        // revers(n-d, n) = 7,6
        // reverse(0, n) = 6, 7, 1, 2, 3, 4, 5

        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        reverse(arr, 0,n - 1);

    }

    private void leftRotate(int[] arr, int n, int d){
        if(n==0) return;
        d = d % n;
        if(d > n) return;


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
        while(start < end){ // doubt do we also need = operator
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
