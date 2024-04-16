import java.util.Scanner;

public class question1 {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int height = scanner.nextInt();
            if (height == 0) break;
            int[] values = new int[(1 << height) - 1];
            for (int i = 0; i < values.length; i++) {
                values[i] = scanner.nextInt();
            }
            int result = calculateP1(height, values);
            System.out.println(result);
        }
    }

    static int calculateP1(int height, int[] values) {
        if (height == 0) return values[0];

        int leftChildIndex = (1 << (height - 1)) - 1;
        int rightChildIndex = leftChildIndex + 1;

        int leftChildValue = calculateP1(height - 1, subArray(values, 0, leftChildIndex + 1));
        int rightChildValue = calculateP1(height - 1, subArray(values, leftChildIndex + 1, values.length));

        int maxValue = Math.max(values[0] * leftChildValue, values[0] * rightChildValue);

        return maxValue % MOD;
    }

    static int[] subArray(int[] array, int start, int end) {
        int[] sub = new int[end - start];
        for (int i = start; i < end; i++) {
            sub[i - start] = array[i];
        }
        return sub;
    }
}
