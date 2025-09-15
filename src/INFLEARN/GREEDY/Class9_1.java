package INFLEARN.GREEDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Body implements Comparable<Body> {
    int height;
    int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }


    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}
public class Class9_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Body> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            people.add(new Body(h, w));
        }

        int cnt = 0;
        Collections.sort(people);

        int max = Integer.MIN_VALUE;

        for (Body b : people) {
            if (b.weight > max) {
                max = b.weight;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
