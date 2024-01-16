import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    static int[] a;
    static int N;
    static Random rnd = new Random();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(tk.nextToken());

        if (N != 0) tk = new StringTokenizer(br.readLine());
        a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(tk.nextToken());
        }

        quicksort(0, N - 1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(a[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    static void quicksort(int l, int r) {
        if (r > l) {
            int x = a[rnd.nextInt(r-l)+l];
            int[] p = partition(l, r, x);
            quicksort(l, p[0] - 1);
            quicksort(p[1], r);
        }
    }

    static int[] partition(int l, int r, int x) {
        int E = l;
        while (E <= r && a[E] < x) {
            E++;
        }
        int G = E;
        while (G <= r && a[G] == x) {
            G++;
        }
        int tempY;
        for (int N = G; N <= r; N++) {
            if (a[N] < x) {
                tempY = a[N];
                a[N] = a[G];
                a[G++] = a[E];
                a[E++] = tempY;
            } else if (a[N] == x) {
                a[N] = a[G];
                a[G++] = x;
            }
        }
        return new int[]{E, G};
    }
}