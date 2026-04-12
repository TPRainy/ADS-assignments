package Assignment_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> bob = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            int op = sc.nextInt();
            if(op==1){
                bob.addFirst(sc.nextInt());
            } else if (op==2) {
                bob.addLast(sc.nextInt());
            } else if (op==3) {
                System.out.println(bob.removeFirst());
            } else if (op==4){
                System.out.println(bob.removeLast());
            }
        }
        sc.close();
    }
}
