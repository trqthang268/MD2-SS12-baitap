package baitap.baitapmain.baitap02;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào");
        String input = scanner.nextLine();
//        	B1 Tạo một stack rỗng để lưu trữ các dấu ngoặc.
        Stack<Character> stack = new Stack<>();
//        	B2: Duyệt từng ký tự trong chuỗi đầu vào.
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
//        	B3: Nếu ký tự đang xét là một dấu ngoặc mở (như (, {, [), đưa nó vào stack.
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
//          B4: Nếu ký tự đang xét là một dấu ngoặc đóng (như ), }, ]), lấy phần tử trên cùng của stack ra và so sánh với dấu ngoặc đóng. Nếu chúng không khớp, chuỗi không đúng. Nếu khớp, tiếp tục xét ký tự tiếp theo.
            else if (ch==')'||ch=='}'||ch==']') {
                if (stack.isEmpty()){
                    System.out.println("Không có cặp ngoặc");
                    return;
                }
                char openBraket = stack.pop();
                if (!isMatchingBracket(openBraket, ch)){
                    System.out.println("Không có cặp ngoặc");
                    return;
                }
            }
        }
//        	B5: Nếu đã duyệt hết chuỗi và stack vẫn còn phần tử, chuỗi không đúng.
        boolean check = stack.isEmpty();
        if (check){
            System.out.println("Có các cặp ngoặc hợp lệ");
        }else{
            System.out.println("Không có cặp ngoặc");
        }
    }
    private static boolean isMatchingBracket(char open, char close) {  // hàm kiểm tra cặp ngoặc trùng khớp
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
