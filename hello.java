public class FibonacciExample {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, count = 5;
        System.out.print("First " + count + " numbers: ");
        for (int i = 1; i <= count; ++i) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
