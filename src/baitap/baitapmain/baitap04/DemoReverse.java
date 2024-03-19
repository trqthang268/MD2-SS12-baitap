package baitap.baitapmain.baitap04;

import java.util.Scanner;
import java.util.Stack;

public class DemoReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//     B1: tạo 1 stack để lưu trữ văn bản
        Stack<String> stack = new Stack<>();
//     B2 tạo 1 biến numberOfWord để lưu số lượng các từ
        int numberOfWord  = 7;
//     B3: tạo 1 vòng lặp for với số lần lặp = số lượng các từ, mỗi vòng lặp cho nhập 1 từ. rồi push vào stack.
        for (int i = 1; i <= numberOfWord ; i++) {
            System.out.println("Nhap tu thu "+i);
            String input = scanner.nextLine();
            stack.push(input);
        }
//     B4: tạo vòng lặp rồi in các từ trong stack ra bằng phương thức remove().
        System.out.println("Van ban dao nguoc la:");
        for (int i = 0; i < numberOfWord ; i++) {
            System.out.print(stack.pop()+" ");
        }
    }

}
