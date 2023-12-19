import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N, M;
        N = Integer.parseInt(tk.nextToken());
        M = Integer.parseInt(tk.nextToken());

        tk = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(tk.nextToken());
        }

        for (int j = 0; j < M; j++) {
            tk = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(tk.nextToken());
            int R = Integer.parseInt(tk.nextToken());
            int result = (R - L < 1) ? -1 : findNotMin(a, L, R);
            System.out.println((result == -1 ? "NOT FOUND" : result));
        }
    }

    static int findNotMin(int[] a, int L, int R) {
        int k = a[L];
        for (int i = L+1; i <= R; i++) {
            if (a[i] != k) {
                return Math.max(a[i],k);
            }
        }
        return -1;
    }
}