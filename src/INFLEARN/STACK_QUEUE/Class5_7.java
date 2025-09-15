package INFLEARN.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Class5_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String hyunsu = br.readLine();
        Queue<Character> queue = new LinkedList<>();

        for (char x : line.toCharArray()) {
            queue.offer(x);
        }

        boolean flag = true;
        for (char h : hyunsu.toCharArray()) {
            if (queue.contains(h)) {
                if (h != queue.poll()) {
                    flag = false;
                    System.out.println("NO");
                    break;
                }
            }
        }
        if (flag && !queue.isEmpty()) {
            flag = false;
            System.out.println("NO");
        }

        if (flag) {
            System.out.println("YES");
        }
    }
}
