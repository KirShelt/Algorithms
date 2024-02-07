import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    static long[] hash;
    static long[] xpows;
    static int p = (int) Math.pow(10, 9) + 7;
    static int x = 257;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String S = br.readLine();
        if (S != null) {
            int n = S.length();
            hash = new long[n + 1];
            xpows = new long[n + 1];
            xpows[0] = 1;

            for (int i = 1; i < n + 1; i++) {
                hash[i] = (hash[i - 1] * x + (int) S.charAt(i - 1)) % p;
                xpows[i] = (xpows[i - 1] * x) % p;
            }
            int k = n;
            do {
                k--;
            }
            while (!equalSubStringDefiner(0, n - k, k));
            System.out.println(n - k);
        } else System.out.println(0);
    }

    static boolean equalSubStringDefiner(int A, int B, int L) {
        return ((hash[A + L] + hash[B] * xpows[L]) % p) == ((hash[B + L] + hash[A] * xpows[L]) % p);
    }
}