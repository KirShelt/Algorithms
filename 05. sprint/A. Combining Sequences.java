import java.io.BufferedReader;
import java.io.FileReader;
//import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
//        long start = System.currentTimeMillis();
        long[] a, b, c;
        int N, M;

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        N = Integer.parseInt(br.readLine());

        a = new long[N];
        for (int i = 1; i <= N; i++) {
            a[i - 1] = (long) i * i;
        }

        M = (int) Math.cbrt((long) N * N) + 1;
        b = new long[M];
        for (int i = 1; i <= M; i++) {
            b[i - 1] = (long) i * i * i;
        }

        c = new long[N + M];
        appendMatrix(a, b, c);
//        System.out.println(N + ":N,an-1:" + a[N - 1]);
//        System.out.println(M + ":M,bm-1:" + b[M - 1]);
        System.out.println(c[N - 1]);
//        System.out.println(System.currentTimeMillis() - start);
    }

    static void appendMatrix(long[] a, long[] b, long[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else if (a[i] > b[j]) {
                c[k] = b[j];
                j++;
            } else {
                c[k] = a[i];
                i++;
                j++;
            }
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
}