import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        defineCorrect(a, b, n);
    }

    static void defineCorrect(int a, int b, int n) {
        System.out.println((a>(b+n-1)/n) ? "Yes" : "No");
    }
}