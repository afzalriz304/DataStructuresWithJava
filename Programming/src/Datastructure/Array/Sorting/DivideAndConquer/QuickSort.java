package Datastructure.Array.Sorting.DivideAndConquer;

import java.util.Scanner;

/**
 * QuickSort is the fasted algorithm with time complexity of O(nlogn)
 * This algo divide and conquer algorithm. It is divide into two steps-
 * <p>
 * 1.Quick
 * 2.QuickSort
 * <p>
 * Quick -  in this step we take the first element and move this element in
 * such that it is at sorted position i.e. all the element on it's right hand
 * side are large and all the element on it's left hand side are small.
 */
public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuickSort quickSort = new QuickSort();
        int[] arr = {55, 22, 77, 65, 40, 33, 97, 88};
        quickSort.Quick(arr);
    }

    public void Quick(int[] arr){
        // these are the pointers
        int left=0;
        int right=arr.length-1;
        // start point
        int loc=0;
        rearrangeElement(left,right,loc,arr);
    }

    public int[] rearrangeElement(int left,int right,int loc,int[] arr){
        checkFromRight(left,right,loc,arr);
        return arr;
    }

    public int[] checkFromRight(int left,int right,int loc,int[] arr){
        if(loc==right){
            return arr;
        }
        else if(arr[loc]>arr[right]){
            int temp = arr[loc];
            arr[loc]=arr[right];
            arr[right]=temp;

            loc=right;
            return checkFromLeft(left,right,loc,arr);
        }else{
            right--;
        }
        return arr;
    }

    public int[] checkFromLeft(int left,int right,int loc,int[] arr){
        if(loc==left){
            return arr;
        }
        else if(arr[loc]<arr[left]){
            int temp = arr[loc];
            arr[loc]=arr[left];
            arr[left]=temp;

            loc=left;
            return checkFromRight(left,right,loc,arr);
        }else{
            left++;
        }
        return arr;
    }
}
