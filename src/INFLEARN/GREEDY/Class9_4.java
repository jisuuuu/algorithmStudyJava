package INFLEARN.GREEDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture implements Comparable<Lecture> {
    int money;
    int time;

    public Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - this.time;
    }
}
public class Class9_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Lecture> arr = new ArrayList<>();

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            arr.add(new Lecture(m, t));
            if (t > max) {
                max = t;
            }
        }

        Collections.sort(arr);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        int j = 0;

        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).time < i) {
                    break;
                }
                queue.offer(arr.get(j).money);
            }
            if (!queue.isEmpty()) {
                answer += queue.poll();
            }
        }

        System.out.println(answer);
    }
}
