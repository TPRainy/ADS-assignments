package Assignment_2;

import java.util.Stack;

public class Task_4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(5);
        st.push(3);
        st.push(1);
        st.push(9);
        reverse(st);
        print(st);
        }

    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()) {
            return;
        }
        int a = st.pop();
        reverse(st);
        bottom(st, a);
    }
    public static void bottom(Stack<Integer> st, int value){
        if (st.isEmpty()){
            st.push(value);
            return;
        }
        int a = st.pop();
        bottom(st,value);
        st.push(a);
    }
    public static void print(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }
        System.out.print(st.pop()+" ");
        print(st);
    }
}

