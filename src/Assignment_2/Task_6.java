package Assignment_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args){
        int[] arr = {4,10,3,5,1};
        System.out.println("Massive before sorting:");
        System.out.println(Arrays.toString(arr));
        buildheap(arr);
        System.out.println("Massive after Max sorting:");
        System.out.println(Arrays.toString(arr));
    }
    public static void heapify(int[] arr, int n, int i){
        int largest=i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if (right<n && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            int swap = arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }
    public static void buildheap(int[] arr){
        int n = arr.length;
        for (int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }
}
