import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack<Integer>
                a = new Stack<>(),
                b = new Stack<>(),
                c = new Stack<>();
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a.push(Integer.parseInt(tk.nextToken()));
        }
        tk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            b.push(Integer.parseInt(tk.nextToken()));
        }
        appendMatrix(a, b, c);
        StringBuilder result = new StringBuilder();
        while (!c.isEmpty()) {
            result.append(c.pop()).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    static void appendMatrix(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
        while ((!a.isEmpty()) && (!b.isEmpty())) {
            if (a.peek() > b.peek()) {
                c.push(a.pop());
            } else c.push(b.pop());
        }
        while (!a.isEmpty()) {
            c.push(a.pop());
        }
        while (!b.isEmpty()) {
            c.push(b.pop());
        }
    }
}