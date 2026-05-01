package Assignment_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        String string1 = sc.nextLine();

        if (string.length() != string1.length()) {
            System.out.println("NO");
            return;
        }

        if (bubble_sort(string).equals(bubble_sort(string1))) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    public static String bubble_sort(String st) {
        char[] array = st.toCharArray();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) break;
        }
        return new String(array);
    }
}