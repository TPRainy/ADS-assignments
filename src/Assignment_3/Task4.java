package Assignment_3;

import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of your weights:");
        int n = sc.nextInt();

        System.out.println("Write your weights:");
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.println("Write number of days:");
        int days = sc.nextInt();
        System.out.println("Smallest possible capacity:");
        System.out.println(binarySearch(n, weights, days));
    }

    public static int binarySearch(int n, int[] array, int days) {
        int biggestNumber = 0;
        int sum=0;
        int middle = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
            sum += array[i];
        }

        while (biggestNumber <= sum) {
            middle = (biggestNumber + sum) / 2;
            if(canShip(array, days, middle)){
                sum=middle-1;
            } else {
                biggestNumber=middle+1;
            }
        }
        return middle;
    }

    //method for checking if we can make it in given days
    public static boolean canShip(int[] weights, int days, int capacity) {
        int current = 0;
        int daysNeeded = 1;
        for (int i = 0; i < weights.length; i++) {
            current += weights[i];
            if (current > capacity) {
                daysNeeded += 1;
                current = 0;
                i--;
            }
        }
        return days >= daysNeeded;
    }
}