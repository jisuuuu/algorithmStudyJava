package INFLEARN.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Class8_15 {
    static int n, m, len, answer=Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> home, pizza;

    public static void dfs(int l, int s) {
        if (l == m) {
            int sum = 0;
            for (Point h : home) {
                int dis = Integer.MAX_VALUE;

                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[l] = i;
                dfs(l + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        pizza = new ArrayList<>();
        home = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int tmp = Integer.parseInt(st.nextToken());

                if (tmp == 1) {
                    home.add(new Point(i, j));
                } else if (tmp == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        len = pizza.size();
        combi = new int[m];

        dfs(0, 0);
        System.out.println(answer);
    }
}
