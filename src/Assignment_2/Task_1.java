package Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        for (int i=0; i<n; i++){
            int m = sc.nextInt();
            ArrayList<Integer> currentLine = new ArrayList<>();
            for (int j=0; j<m; j++){
                currentLine.add(sc.nextInt());
            }
            lines.add(currentLine);
        }

        int l = sc.nextInt();
        for (int i=0;i<l;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.print(lines.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        } sc.close();
    }
}
