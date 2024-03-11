import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int bestWay;
    static boolean[] bestDoles;
    static int[][] graph;
    static int[] maxSumDistances;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        N = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        graph = new int[N + 1][N + 1];
        maxSumDistances = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tk = new StringTokenizer(br.readLine());
            maxSumDistances[i] = 0;
            for (int j = 1; j <= N; j++) {
                int weight = Integer.parseInt(tk.nextToken());
                maxSumDistances[i] += weight;
                if (j < i + 1/* || weight == 0*/) continue;
                graph[i][j] = weight;
            }
        }
        bestWay = 0;
        bestDoles = new boolean[N + 1];
        goToNextPoint(bestDoles, 1);
        StringBuilder result = new StringBuilder();
        result.append(bestWay).append(System.lineSeparator());
        for (int i = 1; i <= N; i++) {
            result.append(bestDoles[i] ? 1 : 2).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    static void goToNextPoint(boolean[] doles, int recurDepth) {
        boolean[] newDoles = doles.clone();
        newDoles[recurDepth] = true;
        int wayCost0 = 0;
        int wayCost1 = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                wayCost0 += (doles[i] != doles[j]) ? graph[i][j] : 0;
                wayCost1 += (newDoles[i] != newDoles[j]) ? graph[i][j] : 0;
            }
        }
        if (recurDepth == N) {
            if (wayCost0 > bestWay) {
                bestWay = wayCost0;
                bestDoles = doles.clone();
            }
            if (wayCost1 > bestWay) {
                bestWay = wayCost1;
                bestDoles = newDoles.clone();
            }
        } else {
            int lastWay = 0;
            for (int i = recurDepth + 1; i <= N; i++) {
                lastWay += maxSumDistances[i];
            }
            if (wayCost0 + lastWay > bestWay) goToNextPoint(doles, recurDepth + 1);
            if (wayCost1 + lastWay > bestWay) goToNextPoint(newDoles, recurDepth + 1);
        }
    }
}