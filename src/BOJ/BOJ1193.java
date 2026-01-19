package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int squareCount = 1; // 해당 대각선(순회하는 대각선)에 있는 칸의 개수
        int squareSum = 0; // 해당 대각선의 전 대각선 칸을 누적 더하기 해서 저장하는 변수

        while (true) {
            if (num <= squareSum + squareCount) {
                if (squareCount % 2 == 1) {
                    //대각선의 개수가 홀수인 범위 내에서는 위쪽(↗︎) 으로 순회 -> 분자 감소, 분모 증가
                    System.out.println((squareCount - (num - squareSum - 1)) + "/" + (num - squareSum));
                    break;
                } else {
                    //대각선의 개수가 짝수인 범위 내에서는 아래쪽(↙︎︎) 으로 순회 -> 분자 증가, 분모 감소
                    System.out.println((num - squareSum) + "/" + (squareCount - (num - squareSum - 1)));
                    break;
                }
            } else { //아직 X번째 분수가 해당 대각선에 포함하지 않는 경우
                squareSum += squareCount;
                squareCount++; //대각선이 늘때마다 해당 칸의 개수도 +1늘기 때문에 +1
            }
        }
    }
}
