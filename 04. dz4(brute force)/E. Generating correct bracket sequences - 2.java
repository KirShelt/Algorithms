import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("brackets2.in"));
        int N = Integer.parseInt(br.readLine());
        char[] combination = new char[N];
        StringBuilder result = new StringBuilder();
        Stack<Character> openedStack = new Stack<>();

        if (N > 1 && (N % 2 == 0)) generateSequence(0, openedStack, combination, result);
        System.out.println(result.toString().trim());
    }

    static void generateSequence(int recursionDepth, Stack<Character> openedStack,
                                 char[] combination, StringBuilder result) {
        if (recursionDepth < combination.length) {
            if ((openedStack.size() + recursionDepth < combination.length)) {
                combination[recursionDepth] = '(';
                openedStack.push('(');
                generateSequence(recursionDepth + 1, openedStack, combination, result);
                openedStack.pop();
                combination[recursionDepth] = '[';
                openedStack.push('[');
                generateSequence(recursionDepth + 1, openedStack, combination, result);
                openedStack.pop();
                if (openedStack.isEmpty()) return;
            }
            if (openedStack.peek() == '(') {
                combination[recursionDepth] = ')';
                openedStack.pop();
                generateSequence(recursionDepth + 1, openedStack, combination, result);
                openedStack.push('(');
                return;
            }
            if (openedStack.peek() == '[') {
                combination[recursionDepth] = ']';
                openedStack.pop();
                generateSequence(recursionDepth + 1, openedStack, combination, result);
                openedStack.push('[');
            }
        } else {
            if (result.length() > 4096) {
                System.out.println(result.toString().trim());
                result.delete(0,result.length());
            }
            result.append(combination).append(System.lineSeparator());
        }
    }
}