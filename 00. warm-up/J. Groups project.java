import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(tk.nextToken());
            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());
            defineCorrect(n, a, b);
        }
    }

    static void defineCorrect(long n, long a, long b) {
        System.out.println((((b-a) * n) < (n % a * a)) ? "NO" : "YES");
    }
}