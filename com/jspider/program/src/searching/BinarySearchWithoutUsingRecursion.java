package com.jspider.program.src.searching;
import java.util.Scanner;
public class BinarySearchWithoutUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={12, 24, 30, 40, 45, 55, 60, 70};
        System.out.println("Enter the value: ");
        int target=sc.nextInt();
        int index=binarySearch(a, target);
        if(index>=0)
            System.out.println(target+" is at index: "+index);
        else
            System.out.println(target+" is not Found");
    }
    public static int binarySearch(int [] arr, int target){
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;

            }
        return -1;
        }
    }

