import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        double[] a =  new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double mean = sum / n;

        double sum1 = 0.0;
        for (int i = 0; i < n; i++) {
            sum1 += (a[i] - mean) * (a[i] - mean);
        }
        double avg1 = Math.sqrt(sum1 / (n - 1));

        System.out.println("Mean: " + mean);
        System.out.println("Sample standard deviation = " + avg1);
    }
}