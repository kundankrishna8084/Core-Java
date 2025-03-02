
package com.jspider.program.src.searching;
public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int target=40;
        int low = 0;
        int high = arr.length - 1;

        int index = search(arr, low, high, target);
        System.out.println("Index is:"+index);
    }
    public static int search(int [] arr,int low,int high,int target){

        if(low>high)
            return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target)
            return mid;
        else if (arr[mid]>target)
            return search(arr,low,mid-1,target);
        else
            return search(arr,mid+1,high,target);
    }
}
