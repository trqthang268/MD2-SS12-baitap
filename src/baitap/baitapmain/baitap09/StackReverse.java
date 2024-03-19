package baitap.baitapmain.baitap09;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,8,9};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int in : arr) {
            System.out.print(in+" ");
        }
        System.out.println();
        String str = "asdjbnsakjbfh";
        StringBuilder sbd = new StringBuilder(str);
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack1.push(str.charAt(i));
        }
        for (int i = 0; i < sbd.length(); i++) {
            sbd.setCharAt(i,stack1.pop());
        }
        System.out.println(sbd);
    }
}
