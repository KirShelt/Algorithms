import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(tk.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        int p = partition(0, N - 1, x, a);
        System.out.println(p);
        System.out.println(N - p);
    }

    static int partition(int l, int r, int x, int[] a) {
        int G = l;
        while (G < (r - l + 1) && a[G] < x) {
            G++;
        }
        for (int N = G + 1; N <= r; N++) {
            if (a[N] < x) {
                int tempY = a[N];
                a[N] = a[G];
                a[G] = tempY;
                G++;
            }
        }
        return G;
    }
}