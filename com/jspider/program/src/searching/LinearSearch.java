
package com.jspider.program.src.searching;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] arr ={12, 24, 30, 12, 45, 55, 60, 43};
        System.out.println("Enter the element to search: ");
        int target = scn.nextInt();
        int index=searchElement(arr,target);
        if(index>=0)
            System.out.println("Element "+target+" is found at index: "+index);
        else
            System.out.println("the given element "+target+" is not Found ");
    }
    public static int searchElement(int [] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
