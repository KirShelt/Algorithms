import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Main {
    public static final double INFINITY = Math.pow(10, 6);

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int S = Integer.parseInt(tk.nextToken());
        int F = Integer.parseInt(tk.nextToken());

        HashMap<Integer, Integer>[] graph = new HashMap[N + 1];
        double[] distances = new double[N + 1];
        int[] prevVertex = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tk = new StringTokenizer(br.readLine());
            distances[i] = INFINITY;
            prevVertex[i] = i;
            graph[i] = new HashMap<>();
            for (int j = 1; j <= N; j++) {
                int weight = Integer.parseInt(tk.nextToken());
                if (weight <= 0) continue;
                graph[i].put(j, weight);
            }
        }

        TreeSet<Integer> routeTree = new TreeSet<>(Comparator.comparingDouble(e -> distances[e] * INFINITY + e));
        distances[S] = 0;
        routeTree.add(S);
        while (!routeTree.isEmpty()) {
            int currentVertex = routeTree.first();
            routeTree.remove(currentVertex);
            for (int neighbour : graph[currentVertex].keySet()) {
                double neighbourDistance = distances[currentVertex] + graph[currentVertex].get(neighbour);
                if (neighbourDistance < distances[neighbour]) {
                    routeTree.remove(neighbour);
                    distances[neighbour] = neighbourDistance;
                    prevVertex[neighbour] = currentVertex;
                    routeTree.add(neighbour);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        if (distances[F] < INFINITY) {
            int curPosition = F;
            result.append(F);
            do {
                curPosition = prevVertex[curPosition];
                result.insert(0, curPosition + " ");
            }
            while (curPosition != S);
        } else result.append(-1);
        System.out.println(result);
    }
}