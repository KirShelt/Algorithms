import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        long postfixSumPrev = 0;
        BigInteger liftSeconds = new BigInteger("0");
        for (int i = 1; i <= n; i++) {
            long postfixSum = postfixSumPrev + a[n - i];
            postfixSumPrev = postfixSum;
            liftSeconds = liftSeconds.add(BigInteger.valueOf(2*(long)Math.ceil((double) postfixSum / k)));
        }
        System.out.println(liftSeconds);
    }
}