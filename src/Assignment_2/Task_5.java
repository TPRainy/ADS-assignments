package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_5 {
    public static void main(String[] args){
        int[] students1= {1,1,0,0};
        int[] samsas1= {0,1,0,1};
        System.out.println(count(students1,samsas1));

        int[] students2= {1,1,1,0,0};
        int[] samsas2= {0,0,1,0,0};
        System.out.println(count(students2,samsas2));
    }
    public static int count(int[] students,int[] samsas){
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int student:students){
            queue.add(student);
        }
        for(int i =samsas.length-1; i>=0;i--){
            st.push(samsas[i]);
        }
        int rejC=0;
        while (!queue.isEmpty()&&rejC<queue.size()){
            if(queue.peek().equals(st.peek())){
                queue.poll();
                st.pop();
                rejC=0;
            } else {
                int student = queue.poll();
                queue.add(student);
                rejC++;
            }
        }
        return queue.size();
    }
}
