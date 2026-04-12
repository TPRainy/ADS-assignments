package Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n;i++){
            list.add(sc.nextInt());
        }

        int m = sc.nextInt();
        for (int i=0;i<m;i++){
            String op = sc.next();
            if(op.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x,y);
            } else if(op.equals("Delete")){
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        for(int numbers:list){
            System.out.print(numbers+" ");
        }
        sc.close();
    }
}
