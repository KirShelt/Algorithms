import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
    public static final int INFINITY = (int) Math.pow(10, 6);

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int N = Integer.parseInt(br.readLine());
        HashSet<Route>[] graph = new HashSet[N + 1];
        int[] distances = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            distances[i] = INFINITY;
            graph[i] = new HashSet<>();
        }

        StringTokenizer tk = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(tk.nextToken());
        int v = Integer.parseInt(tk.nextToken());
        int R = Integer.parseInt(br.readLine());

        for (int i = 0; i < R; i++) {
            tk = new StringTokenizer(br.readLine());
            int country1 = Integer.parseInt(tk.nextToken());
            int startTime = Integer.parseInt(tk.nextToken());
            int country2 = Integer.parseInt(tk.nextToken());
            int endTime = Integer.parseInt(tk.nextToken());
            graph[country1].add(new Route(country2,startTime,endTime));
        }

        TreeSet<Route> routeTree = new TreeSet<>();
        distances[d] = 0;
        routeTree.add(new Route(d, distances[d], distances[d]));
        while (!routeTree.isEmpty()) {
            Route currentRoute = routeTree.first();
            routeTree.remove(currentRoute);
            for (Route neighbour : graph[currentRoute.vertexTo]) {
                if (neighbour.endTime < distances[neighbour.vertexTo] && currentRoute.endTime <=neighbour.startTime) {
                    routeTree.remove(new Route(neighbour.vertexTo, 0, distances[neighbour.vertexTo]));
                    distances[neighbour.vertexTo] = neighbour.endTime;
                    routeTree.add(new Route(neighbour.vertexTo, neighbour.startTime, neighbour.endTime));
                }
            }
        }

        System.out.println(distances[v] >= INFINITY ? -1 : distances[v]);
    }

    static class Route implements Comparable<Route> {
        final int vertexTo;
        final int startTime;
        final int endTime;

        public Route(int to, int start, int end) {
            vertexTo = to;
            startTime = start;
            endTime = end;
        }

        @Override
        public int compareTo(Route p) {
            if (p.endTime > this.endTime) return -1;
            if (p.endTime < this.endTime) return 1;
            return Integer.compare(this.vertexTo, p.vertexTo);
        }
    }
}