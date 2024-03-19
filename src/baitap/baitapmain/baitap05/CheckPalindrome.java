package baitap.baitapmain.baitap05;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra");
        String input = scanner.nextLine().toLowerCase();
//        "Able was I ere I saw Elba"
        Stack<Character> stackInput = new Stack<>();
        Queue<Character> queueInput =new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            queueInput.offer(input.charAt(i));
            stackInput.push(input.charAt(i));
        }
        System.out.println();
        while (!queueInput.isEmpty()){
            if (queueInput.poll() != stackInput.pop()){
                System.out.println("Khong phai palindrone");
                return;
            }
        }
        System.out.println("La palindrone");
    }
}
