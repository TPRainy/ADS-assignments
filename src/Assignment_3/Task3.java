package Assignment_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        bubbleSort(n,array);
        System.out.println(array[n/2]);
    }
    public static void bubbleSort(int n, int[] array){
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
