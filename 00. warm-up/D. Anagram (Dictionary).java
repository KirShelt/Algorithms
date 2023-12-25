import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String result = "YES";
        if (str1.length() != str2.length()) {
            result = "NO";
        } else {
            HashMap<Character, Integer> dict = new HashMap<>();

            for (int i = 0; i < str1.length(); i++) {
                char curChar = str1.charAt(i);
                Integer curCharNum = dict.get(curChar);
                if (curCharNum == null) {
                    dict.put(curChar, 1);
                } else dict.replace(curChar, curCharNum + 1);
            }

            for (int i = 0; i < str2.length(); i++) {
                char curChar = str2.charAt(i);
                Integer curCharNum = dict.get(curChar);
                if (curCharNum == null || curCharNum < 1) {
                    result = "NO";
                    break;
                } else dict.replace(curChar, curCharNum - 1);
            }
        }
        System.out.println(result);
    }
}