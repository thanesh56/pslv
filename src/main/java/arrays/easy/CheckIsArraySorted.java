package arrays.easy;

public class CheckIsArraySorted {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
        //int[] arr = {1,2,1,4,5,6,7,7};
        //int[] arr = {1,2,3,4,5,6,7,7,0};
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 7};

        System.out.print("Given array: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        CheckIsArraySorted checkArraySorted = new CheckIsArraySorted();
        System.out.println("checkArraySorted = " + checkArraySorted.check(arr));
    }

    private boolean check(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
