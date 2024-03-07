import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int N = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        int[] symbols = new int[N];
        for (int i = 0; i < N; i++) symbols[i] = i + 1;
        ArrayList<Integer> list = allSwaps(symbols);

        for (int i : list) {
            result.append(i).append(System.lineSeparator());
        }
        System.out.println(result.toString().trim());
    }

    static ArrayList<Integer> allSwaps(int[] symbols) {
        ArrayList<Integer> newList = new ArrayList<>();
        if (symbols.length > 1) {
            for (int i = 0; i < symbols.length; i++) {
                int[] newSymbols = new int[symbols.length - 1];
                for (int j = 0; j < i; j++) newSymbols[j] = symbols[j];
                for (int j = i + 1; j < symbols.length; j++) newSymbols[j - 1] = symbols[j];
                ArrayList<Integer> list = allSwaps(newSymbols);
                for (int j = 0; j < list.size(); j++) {
                    newList.add(list.get(j) + symbols[i] * (int) Math.pow(10, symbols.length - 1));
                }
            }
        } else newList.add(symbols[0]);
        return newList;
    }
}