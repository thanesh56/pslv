package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class FindUnionAndIntersectionOfArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5};
        int[] b = {2,3,3,4,4,5,6};
        //System.out.print("Union Array: ");
        //List<Integer> res = findUnion(a, b);

        System.out.print("Intersection Array: ");
        List<Integer> res = findIntersection(a, b);
        for (Integer it : res) {
            System.out.print(it+" ");
        }


    }

    private static List<Integer> findIntersection(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        List<Integer> intersectArr = new ArrayList<>();
        while (i < n1 && j < n2){
            if(a[i] < b[j]){
                i++;
            } else if (b[j] < a[i]) {
                j++;
            }
            else {
                intersectArr.add(a[i]);
                i++;
                j++;
            }
        }
        return intersectArr;
    }

    public static List< Integer > findUnion(int []a, int []b) {
        // Write your code here
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        List< Integer > unionArr = new ArrayList<>();
        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != a[i]){
                    unionArr.add(a[i]);
                }
                i++;
            }
            else {
                if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != b[j]){
                    unionArr.add(b[j]);
                }
                j++;
            }
        }// end of while loop

        // add remaining element in UnionArray
        while(i < n1){
            if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != a[i]){
                unionArr.add(a[i]);
            }
            i++;
        }

        while(j < n2){
            if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != b[j]){
                unionArr.add(b[j]);
            }
            j++;
        }
        return unionArr;
    }
}
