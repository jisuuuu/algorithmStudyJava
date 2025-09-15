package INFLEARN.SORTING_SEARCHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class6_8 {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0, rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(n, m, arr));
    }
}
