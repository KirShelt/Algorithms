import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String input = br.readLine();
        System.out.println(((input != null) && goodTagChecker(input)) ? "yes" : "no");
    }

    static boolean goodTagChecker(String input) {
        HashMap<Character, Character> tags = new HashMap<>();
        tags.put(')', '(');
        tags.put('}', '{');
        tags.put(']', '[');
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (tags.containsValue(input.charAt(i))) {
                a.push(input.charAt(i));
            } else {
                if ((!a.isEmpty()) && (tags.get(input.charAt(i)) == a.peek())) {
                    a.pop();
                } else return false;
            }
        }
        return a.isEmpty();
    }
}