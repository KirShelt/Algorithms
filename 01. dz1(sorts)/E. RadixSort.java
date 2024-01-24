import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        int n;

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        n = Integer.parseInt(br.readLine());

        ArrayList<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(br.readLine());
        }

        System.out.println("Initial array:");
        printArray(s);

        if (n > 0) DigitsSort(s);
        System.out.println("**********" + System.lineSeparator() + "Sorted array:");
        printArray(s);

    }

    static void DigitsSort(ArrayList<String> s) {
        ArrayList<String>[] buckets = new ArrayList[10];
        int digitNums = s.get(0).length();
        for (int digit = digitNums; digit > 0; digit--) {
            System.out.println("**********" + System.lineSeparator() + "Phase " + (digitNums - digit + 1));
            for (int j = 0; j < 10; j++) {
                buckets[j] = new ArrayList<>();
            }
            for (String ts : s){
                int index = Integer.parseInt(ts.substring(digit - 1, digit));
                buckets[index].add(ts);
            }
            s.clear();
            for (int j = 0; j < 10; j++) {
                System.out.print("Bucket " + j + ": ");
                StringBuilder out = new StringBuilder();
                for (String ts : buckets[j]){
                    s.add(ts);
                    out.append(ts).append(", ");
                }
                System.out.println(out.isEmpty() ? "empty" : out.substring(0,out.length()-2));
            }
        }
    }

    static void printArray(ArrayList<String> s) {
        String result = s.toString();
        System.out.println(result.substring(1,result.length()-1));
    }
}