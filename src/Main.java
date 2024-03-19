import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        Danh sach đầu vào
        String[] inputList = {"Anh","Phương","Đạo","Đạt","Đông","Được"};
        for (String s : inputList) {
            queue.add(s);
        }
        System.out.println("Các phần tử của Queue:");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}