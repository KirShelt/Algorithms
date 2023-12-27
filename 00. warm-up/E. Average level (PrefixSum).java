import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());

        tk = new StringTokenizer(br.readLine());
        long[] a = new long[n];
        long[] prefixSum = new long[n + 1];
        prefixSum[0] = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tk.nextToken());
            prefixSum[i + 1] = prefixSum[i] + a[i];
        }
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long iResult = a[i]*(2*i+1-n)-prefixSum[i]+prefixSum[n]-prefixSum[i+1];
            resultString.append(iResult).append(" ");
        }
        System.out.println(resultString.toString().trim());
    }
}
