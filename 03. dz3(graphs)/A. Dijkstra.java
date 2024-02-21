import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
    public static final int INFINITY = (int)Math.pow(10, 6);

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int S = Integer.parseInt(tk.nextToken());
        int F = Integer.parseInt(tk.nextToken());

        HashMap<Integer, Integer>[] graph = new HashMap[N + 1];
        int[] distances = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tk = new StringTokenizer(br.readLine());
            distances[i] = INFINITY;
            graph[i] = new HashMap<>();
            for (int j = 1; j <= N; j++) {
                int weight = Integer.parseInt(tk.nextToken());
                if (weight > 0) graph[i].put(j, weight);
            }
        }

        TreeSet<Pair> routeTree = new TreeSet<>();
        distances[S] = 0;
        routeTree.add(new Pair(S, distances[S]));
        while (!routeTree.isEmpty()) {
            Pair currentPair = routeTree.first();
            routeTree.remove(currentPair);
            for (int neighbour : graph[currentPair.vertex].keySet()) {
                int neighbourDistance = distances[currentPair.vertex] + graph[currentPair.vertex].get(neighbour);
                if (neighbourDistance < distances[neighbour]) {
                    routeTree.remove(new Pair(neighbour, distances[neighbour]));
                    distances[neighbour] = neighbourDistance;
                    routeTree.add(new Pair(neighbour, distances[neighbour]));
                }
            }
        }

        System.out.println(distances[F] >= INFINITY ? -1 : (int) distances[F]);
    }

    static class Pair implements Comparable<Pair> {
        final int vertex;
        final int distance;

        public Pair(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair p) {
            if (p.distance > this.distance) return 1;
            if (p.distance < this.distance) return -1;
            if (p.vertex > this.vertex) return 1;
            if (p.vertex < this.vertex) return -1;
            return 0;
        }
    }
}