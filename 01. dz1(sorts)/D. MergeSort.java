import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());

        tk = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(tk.nextToken());
        }

        mergeSort(a);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(a[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    static void mergeSort(int[] c) {
        if (c.length > 1) {
            int[] a, b;
            a = new int[c.length / 2];
            b = new int[c.length - a.length];
            int i = 0;
            for (; i < a.length; i++) {
                a[i] = c[i];
            }
            for (int j = 0; j < b.length; j++, i++) {
                b[j] = c[i];
            }
            mergeSort(a);
            mergeSort(b);
            appendMatrix(a, b, c);
        }
    }
    static void appendMatrix(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
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