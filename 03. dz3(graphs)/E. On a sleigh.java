import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
    public static final double INFINITY = Math.pow(10, 9);
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        N = Integer.parseInt(br.readLine());
        int[] velocity = new int[N + 1];
        int[] preparationT = new int[N + 1];
        StringTokenizer tk;
        for (int i = 1; i <= N; i++) {
            tk = new StringTokenizer(br.readLine());
            preparationT[i] = Integer.parseInt(tk.nextToken());
            velocity[i] = Integer.parseInt(tk.nextToken());
        }

        int[][] startGraph = new int[N + 1][N + 1];
        int[][] graph = new int[N + 1][N + 1];
        double[] distances = new double[N + 1];
        int[] prevVertex = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            distances[i] = INFINITY;
            prevVertex[i] = i;
        }
        for (int i = 1; i < N; i++) {
            tk = new StringTokenizer(br.readLine());
            int vertexFrom = Integer.parseInt(tk.nextToken());
            int vertexTo = Integer.parseInt(tk.nextToken());
            int distance = Integer.parseInt(tk.nextToken());
            startGraph[vertexFrom][vertexTo] = distance;
            startGraph[vertexTo][vertexFrom] = distance;
        }

        for (int i = 2; i <= N; i++) {
            startGraph[1][i] = 0;
        }

        boolean[] visited;
        for (int i = 2; i <= N; i++) {
            visited = new boolean[N + 1];
            dfs(i, 0, i, visited, startGraph, graph);
        }

        TreeSet<Route> routeTree = new TreeSet<>();
        int startPoint = 1;
        distances[startPoint] = 0;
        routeTree.add(new Route(startPoint, distances[startPoint]));
        while (!routeTree.isEmpty()) {
            Route currentRoute = routeTree.first();
            routeTree.remove(currentRoute);
            for (int neighbour =1; neighbour<=N; neighbour++) {
                if (graph[currentRoute.vertexTo][neighbour]<1) continue;
                double neighbourDistance = distances[currentRoute.vertexTo] + preparationT[neighbour] +
                        (double) graph[currentRoute.vertexTo][neighbour] / velocity[neighbour];
                if (neighbourDistance < distances[neighbour]) {
                    routeTree.remove(new Route(neighbour, distances[neighbour]));
                    distances[neighbour] = neighbourDistance;
                    prevVertex[neighbour] = currentRoute.vertexTo;
                    routeTree.add(new Route(neighbour, distances[neighbour]));
                }
            }
        }

        int endPoint = 1;
        for (int i = 1; i <= N; i++) {
            if (distances[i] > distances[endPoint]) endPoint = i;
        }
        System.out.println(distances[endPoint]);

        StringBuilder result = new StringBuilder();
        if (distances[endPoint] < INFINITY) {
            result.append(endPoint);
            int curPosition = endPoint;
            do {
                curPosition = prevVertex[curPosition];
                result.append(" ").append(curPosition);
            }
            while (curPosition != startPoint);
        } else result.append(-1);

        System.out.println(result);
    }

    static class Route implements Comparable<Route> {
        int vertexTo;
        double distance;

        public Route(int to, double value) {
            vertexTo = to;
            distance = value;
        }

        @Override
        public int compareTo(Route p) {
            if (p.distance > this.distance) return -1;
            if (p.distance < this.distance) return 1;
            return Integer.compare(this.vertexTo, p.vertexTo);
        }
    }

    static void dfs(int startVertex, int startDistance, int currentVertex, boolean[] visited,
                    int[][] startGraph, int[][] graph) {
        visited[currentVertex] = true;
        for (int neighbour = 1; neighbour <= N; neighbour++) {
            if (visited[neighbour] || startGraph[currentVertex][neighbour] < 1) continue;
            int newDistance = startDistance + startGraph[currentVertex][neighbour];
            graph[neighbour][startVertex] = newDistance;
            graph[startVertex][neighbour] = newDistance;
            dfs(startVertex, newDistance, neighbour, visited, startGraph, graph);
        }
    }
}