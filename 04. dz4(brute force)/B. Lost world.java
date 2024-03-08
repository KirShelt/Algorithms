import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    static int combinations = 0;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        N = Integer.parseInt(br.readLine());
        putTheFerz(new int[0]);
        System.out.println(combinations);
    }

    static void putTheFerz(int[] stayPositions) {
        int x = stayPositions.length;
        int[] newStayPositions = new int[x + 1];
        for (int i = 0; i < x; i++) newStayPositions[i] = stayPositions[i];

        if (x < N) {
            for (int y = 0; y < N; y++) {
                newStayPositions[x] = y;
                boolean goodCombination = true;
                for (int j = 0; j < x; j++) {
                    int xOld = j;
                    int yOld = stayPositions[j];
                    if (y == yOld || (y + x) == (yOld + xOld) || (y - x) == (yOld - xOld)) {
                        goodCombination = false;
                        break;
                    }
                }
                if (goodCombination) putTheFerz(newStayPositions);
            }
        } else combinations++;
    }
}