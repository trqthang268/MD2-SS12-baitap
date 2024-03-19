package baitap.baitapmain.baitap14;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ScheduledExecutorService;

public class CheckStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra :");
        String str = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                stack.push(Character.getNumericValue(str.charAt(i)));
            }
        }
        if (stack.empty()){
            System.out.println("Chuỗi trên là chuỗi rỗng");
        }else{
            boolean flag = false;
            for (int i = 0; i < stack.size(); i++) {
                for (int j = 2; j < stack.get(i); j++) {
                    if (stack.get(i)%j==0){
                        flag = true;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println("Chuỗi trên không phải là chuỗi số nguyên tố");
            }else{
                System.out.println("Chuỗi trên là chuỗi số nguyên tố");
            }
        }
    }
}
