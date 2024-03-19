package baitap.baitapmain.baitap13;

import java.util.Scanner;
import java.util.Stack;

public class CheckStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        Stack<Character> stack = new Stack<>();
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println(stack);
        char first;
        boolean flag = true;
        for (int i = 1; i < stack.size(); i++) {
            first = stack.get(i-1);
            for (int j = i+1; j < stack.size(); j++) {
                if (stack.get(i)>first){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("Chuỗi này là chuỗi giảm dần");
        }else{
            System.out.println("Chuỗi này không phải là chuỗi giảm dần");
        }
    }
}
