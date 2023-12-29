import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        int maxSquareSize = 0;
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        int[][] dp = new int[N][M];

        tk = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            dp[0][j] = Integer.parseInt(tk.nextToken());
            if (dp[0][j] > maxSquareSize) maxSquareSize = dp[0][j];
        }
        for (int i = 1; i < N; i++) {
            tk = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(tk.nextToken());
            if (dp[i][0] > maxSquareSize) maxSquareSize = dp[i][0];
            for (int j = 1; j < M; j++) {
                if (Integer.parseInt(tk.nextToken()) == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dpFunc(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]);
                    if (dp[i][j] > maxSquareSize) maxSquareSize = dp[i][j];
                }
            }
        }
        System.out.println(maxSquareSize);
    }

    static int dpFunc(int a00, int a01, int a10) {
        return Math.min(Math.min(a00, a01), a10) + 1;
    }
}