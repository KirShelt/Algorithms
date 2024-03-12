import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int N;
    public static final int INFINITY = (int) Math.pow(10, 9);
    static int bestWay;
    static HashMap<Integer, Integer>[] graph;
    static int[] minDistances;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        N = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        graph = new HashMap[N + 1];
        minDistances = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tk = new StringTokenizer(br.readLine());
            minDistances[i] = INFINITY;
            graph[i] = new HashMap<>();
            for (int j = 1; j <= N; j++) {
                int weight = Integer.parseInt(tk.nextToken());
                if (weight<=0 && i!=j) continue;
                if (weight < minDistances[i]) minDistances[i] = weight;
                graph[i].put(j, weight);
            }
        }
//        bestWay = INFINITY;
        bestWay = zhadenAlgo();
        if (bestWay>=0) goToNextPoint(0, 1, new boolean[N + 1], 1);
        System.out.println(bestWay);
    }

    static void goToNextPoint(int currentWay, int currentVertex, boolean[] visited, int recurDepth) {
        boolean[] newVisited = visited.clone();
        newVisited[currentVertex] = true;
        for (int neighbour : graph[currentVertex].keySet()) {
            if (newVisited[neighbour]) continue;
            int endWay = 0;
            for (int i = 1; i <= N; i++) {
                if (!newVisited[i]) endWay += minDistances[i];
            }
            int cW = currentWay + graph[currentVertex].get(neighbour);
            if (cW + endWay < bestWay) {
                goToNextPoint(cW, neighbour, newVisited, recurDepth + 1);
            }
        }
        if (recurDepth == N) bestWay = Math.min(bestWay, currentWay + graph[1].get(currentVertex));
    }

    static int zhadenAlgo() {
        boolean[] visited = new boolean[N + 1];
        int wayCost = 0;
        int currentVertex = 1;
        visited[currentVertex] = true;
        for (int i = 1; i < N; i++) {
            int currentMinDistance = INFINITY;
            int currentMinWeightPoint = -1;
            for (int neighbour : graph[currentVertex].keySet()) {
                if (visited[neighbour]) continue;
                int currentDistance = graph[currentVertex].get(neighbour);
                if (currentDistance < currentMinDistance) {
                    currentMinDistance = currentDistance;
                    currentMinWeightPoint = neighbour;
                }
            }
            currentVertex = currentMinWeightPoint;
            if (currentVertex == -1) return -1;
            visited[currentVertex] = true;
            wayCost += currentMinDistance;
        }
        return (graph[currentVertex].containsKey(1)) ? wayCost + graph[1].get(currentVertex) : -1;
    }
}