package arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class SortedArrayRemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        System.out.print("Given Array is: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        SortedArrayRemoveDuplicate sard = new SortedArrayRemoveDuplicate();

        // First approach using set O(NlogN) + then again insert it in array O(N), it also take space which is O(N)
        //int count = sard.removeDupUsingSet(arr);

        // Second approach using two pointer O(N)
        int count = sard.removeDupUsing(arr);


        System.out.print("Count of unique element is = " + count + ", and array is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + ", ");
        }


    }

    private int removeDupUsing(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    private int removeDupUsingSet(int[] arr) {
        Set<Integer> tempSet = new HashSet<>();
        for (int element : arr) {
            tempSet.add(element);
        }

        int index = 0;
        for (Integer element : tempSet) {
            arr[index] = element;
            index++;
        }
        return index;
    }
}
