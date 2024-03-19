package baitap.baitapmain.baitap12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SearchMin {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] array = {1, 67, 4, 7, 3, 7};
        for (int i = 0; i < array.length; i++) {
                queue.offer(array[i]);
        }
        System.out.println("Mang queue ban dau "+queue);
        int min = queue.poll();
        while (!queue.isEmpty()){
            int e = queue.poll();
            if (min > e){
                queue.add(e);
                min = e;
            }else{
                queue.add(min);
                break;
            }
            System.out.println("Phan tu nho nhat la :"+min);
        }
    }
}
