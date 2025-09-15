package INFLEARN.SORTING_SEARCHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Class6_3 {
    public static int[] solution(int n, int[] arr){
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                }
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int a : solution(n, arr)) {
            System.out.print(a + " ");
        }
    }
}
