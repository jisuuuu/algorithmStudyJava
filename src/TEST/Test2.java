package TEST;

public class Test2 {
    public static int solution(int[] A) {
        int answer = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] <= 0) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 4, 1, 3, 5}));
        System.out.println(solution(new int[]{1, 5, 6, 10}));
        System.out.println(solution(new int[]{3, 5, 7, 7}));
    }
}
