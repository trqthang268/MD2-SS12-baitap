package baitap.baitapmain.baitap11;

import java.util.Stack;

public class SearchMax {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 67, 4, 7, 3, 7};
        for (int i = 0; i < array.length; i++) {
            if (stack.isEmpty() || array[i] > stack.peek()) {
                stack.push(array[i]);
            }
        }
        System.out.println("Phan tu lon nhat la " + stack.peek());
    }
}
