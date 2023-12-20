import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        int c = Integer.parseInt(tk.nextToken());
        int d = Integer.parseInt(tk.nextToken());

        int resultTop = a * d + c * b;
        int resultDown = b * d;
        int nod = findNOD(resultTop, resultDown);
        resultTop /= nod;
        resultDown /= nod;
        System.out.println(resultTop + " " + resultDown);
    }

    static int findNOD(int a, int b) { //Eukid algorithm
        int d = a % b;
        while (d > 0) {
            a = d;
            d = b % d;
            b = a;
        }
        return b;
    }
}