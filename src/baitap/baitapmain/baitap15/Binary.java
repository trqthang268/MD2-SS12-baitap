package baitap.baitapmain.baitap15;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy cần chuyển đổi");
        int num = scanner.nextInt();
        while (num!=0){
            stack.push(num%2);
            num /=2;
        }
        System.out.print("Giá trị nhị phân là: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
