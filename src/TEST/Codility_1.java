package TEST;

public class Codility_1 {
    public static void main(String[] args) {
        int n = 529;
        int maxGap = 0;
        int curr = 0;
        boolean started = false;

        while (n > 0) {
            if (n % 2 == 1) {
                if (started) {
                    if (curr > maxGap) {
                        maxGap = curr;
                    }
                }
                started = true;
                curr = 0;
            } else if (started) {
                curr++;
            }
            n = n /2;
        }
        System.out.println(maxGap);
    }
}
