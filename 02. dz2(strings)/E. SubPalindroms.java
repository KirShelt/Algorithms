import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    static long[] hash;
    static long[] reverseHash;
    static long[] xpows;

    static int p = (int) Math.pow(10, 9) + 7;

    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String S = br.readLine();
        N = S.length();
        hash = new long[N + 1];
        reverseHash = new long[N + 1];
        xpows = new long[N + 1];
        xpows[0] = 1;
        int x = 257;

        for (int i = 1; i < N + 1; i++) {
            hash[i] = (hash[i - 1] * x + (int) S.charAt(i - 1)) % p;
            reverseHash[i] = (reverseHash[i - 1] * x + (int) S.charAt(N - i)) % p;
            xpows[i] = (xpows[i - 1] * x) % p;
        }

        long palyndromsCount = 0;
        for (int c = 0; c < N; c++) {
            palyndromsCount += binarySearch(c, Math.min(c + 1, N - c), 1);//odd bsearch
            palyndromsCount += binarySearch(c, Math.min(c, N - c), 0); // even bsearch
        }
        System.out.println(palyndromsCount);

    }

    static boolean equalSubStringDefiner(int A, int B, int L) {
        return ((hash[A + L] + reverseHash[B] * xpows[L]) % p) == ((reverseHash[B + L] + hash[A] * xpows[L]) % p);
    }

    static int binarySearch(int center, int length, int odd) {
        int minLen = 1, maxLen = length;
        int z = 0;
        while (maxLen >= minLen) {
            int curLen = (maxLen + minLen) / 2;
            if (equalSubStringDefiner(center - curLen + odd, N - center - curLen, 2 * curLen - odd)) {
                z = curLen;
                minLen = curLen + 1;
            } else maxLen = curLen - 1;
        }
        return z;
    }
}