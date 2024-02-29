import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
    public static final long INFINITY = (long) Math.pow(10, 12);

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        int K = Integer.parseInt(tk.nextToken());

        HashMap<Integer, Integer>[] graph = new HashMap[N + 1];
        long[] distances = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            distances[i] = INFINITY;
            graph[i] = new HashMap<>();
        }

        for (int i = 0; i < K; i++) {
            tk = new StringTokenizer(br.readLine());
            int vertex1 = Integer.parseInt(tk.nextToken());
            int vertex2 = Integer.parseInt(tk.nextToken());
            int distance = Integer.parseInt(tk.nextToken());
            graph[vertex1].put(vertex2, distance);
            graph[vertex2].put(vertex1, distance);
        }

        tk = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(tk.nextToken());
        int B = Integer.parseInt(tk.nextToken());

        TreeSet<Pair> routeTree = new TreeSet<>();
        distances[A] = 0;
        routeTree.add(new Pair(A, distances[A]));
        while (!routeTree.isEmpty()) {
            Pair currentPair = routeTree.first();
            routeTree.remove(currentPair);
            for (int neighbour : graph[currentPair.vertex].keySet()) {
                long neighbourDistance = distances[currentPair.vertex] + graph[currentPair.vertex].get(neighbour);
                if (neighbourDistance < distances[neighbour]) {
                    routeTree.remove(new Pair(neighbour, distances[neighbour]));
                    distances[neighbour] = neighbourDistance;
                    routeTree.add(new Pair(neighbour, distances[neighbour]));
                }
            }
        }

        System.out.println(distances[B] >= INFINITY ? -1 : (long) distances[B]);
    }

    static class Pair implements Comparable<Pair> {
        final int vertex;
        final long distance;

        public Pair(int vertex, long distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair p) {
            if (p.distance > this.distance) return -1;
            if (p.distance < this.distance) return 1;
            return Integer.compare(this.vertex, p.vertex);
        }
    }
}