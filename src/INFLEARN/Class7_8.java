package INFLEARN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class7_8 {
    static int answer = 0;
    static int[] d = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> queue = new LinkedList<>();

    public static int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        queue.offer(s);

        int l = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + d[j];

                    if (nx == e) {
                        return l + 1;
                    }

                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            l++;
        }

        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(bfs(s, e));
    }
}
