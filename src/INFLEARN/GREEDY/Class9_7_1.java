package INFLEARN.GREEDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Edge1 implements Comparable<Edge1>{
    public int v1;
    public int v2;
    public int cost;

    Edge1(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge1 ob){
        return this.cost - ob.cost;
    }
}
public class Class9_7_1 {
    static int[] unf;

    public static int find(int v){
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }
    public static void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        unf = new int[n + 1];

        ArrayList<Edge1> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr.add(new Edge1(a, b, c));
        }

        int answer = 0;
        Collections.sort(arr);

        for (Edge1 e : arr) {
            int f1 = find(e.v1);
            int f2 = find(e.v2);

            if (f1 != f2) {
                answer += e.cost;
                union(e.v1, e.v2);
            }
        }
        System.out.println(answer);
    }
}
