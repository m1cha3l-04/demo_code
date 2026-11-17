public class ScopeError {
    public static void compute() {
        int result = 42;
    }

    public static void main(String[] args) {
        compute();
        System.out.println(result);                // main cannot see result
    }
}