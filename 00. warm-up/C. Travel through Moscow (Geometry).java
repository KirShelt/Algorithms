import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        double xA = Double.parseDouble(tk.nextToken());
        double yA = Double.parseDouble(tk.nextToken());
        double xB = Double.parseDouble(tk.nextToken());
        double yB = Double.parseDouble(tk.nextToken());

        double angleRad = computeAngle(xA, yA, xB, yB);
        double rA = Math.sqrt(xA * xA + yA * yA);
        double rB = Math.sqrt(xB * xB + yB * yB);
        double rMin = Math.min(rA, rB);
        double rMax = Math.max(rA, rB);
        System.out.println(angleRad >= 2 ? rA + rB : (angleRad-1) * rMin + rMax);
    }

    static double computeAngle(double xA, double yA, double xB, double yB) {
        double b = Math.abs(Math.atan2(yA, xA) - Math.atan2(yB, xB));
        return b <= Math.PI ? b : 2 * Math.PI - b;
    }
}