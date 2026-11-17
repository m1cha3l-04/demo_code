public class PassByValue {
    public static void addTen(int n) {
        n = n + 10;                                // changes the copy only
        System.out.println("Inside addTen: " + n);
    }

    public static void main(String[] args) {
        int score = 5;
        addTen(score);
        System.out.println("Back in main: " + score);
    }
}