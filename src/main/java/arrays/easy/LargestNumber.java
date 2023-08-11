package arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        LargestNumber ln = new LargestNumber();

        System.out.print("Given array: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        //System.out.println("Largest number is: " + ln.findLargestNum(arr));

        // First approach O(nlogn)+O(n)
        //System.out.println("Second Largest number is: " + ln.findSecondLargestNumUsingSort(arr));

        // Second approach O(n)
        System.out.println("Second Largest number is: " + ln.findSecondLargestNumUsingTwoPointer(arr));
    }

    private int findSecondLargestNumUsingTwoPointer(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    private int findSecondLargestNumUsingSort(int[] arr) {
        Arrays.sort(arr);
        int secondLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }


    // O(N)
    private int findLargestNum(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
