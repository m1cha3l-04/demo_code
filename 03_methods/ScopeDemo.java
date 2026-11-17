public class ScopeDemo {
    public static int addUp(int limit) {           // limit: a parameter
        int total = 0;                             // total: local to addUp
        for (int i = 1; i <= limit; i++) {         // i: only inside the loop
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        int total = addUp(5);                      // a DIFFERENT total
        int limit = 10;                            // a DIFFERENT limit
        System.out.println("total = " + total);
        System.out.println("limit = " + limit);
    }
}