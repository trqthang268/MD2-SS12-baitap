package baitap.baitapmain.baitap06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracketFinal {
    static boolean checkChar (String sym){
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < sym.length(); i++) {
            char n = sym.charAt(i);
            if (n =='('||n=='{'||n=='['){
                stack.push(n);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (n){
                case ')':
                    check = stack.pop();
                    if (check == '}'||check == ']'){
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == ')'|| check == ']'){
                        return false;
                    }
                    break;
                case']':
                    check = stack.pop();
                    if (check == '}'|| check == ')'){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String x = "s*(s–a)*(s–b)*(s–c)";
        String y = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        if (checkChar(x)){
            System.out.println("Well");
        }else {
            System.out.println("???");
        }
    }
}
//        1. Tạo một bStack rỗng (Stack chứa dấu ngoặc).
//        2. Với mỗi ký hiệu sym trong đoạn (từ trái sang phải):
//        2.1. Nếu sym là dấu ngoặc trái:
//        •	2.1.1. Đưa sym vào bStack.
//        2.2. Nếu sym là dấu ngoặc phải:
//        •	2.2.1. Nếu bStack rỗng, return false.
//        •	2.2.2. Lấy dấu ngoặc ở bStack, đưa vào biến left.
//        •	2.2.3. Nếu left và sym không khớp được với nhau, return false.
//        3. Dừng giải thuật, trả về True nếu bStack rỗng, hoặc False với các trường hợp khác.
