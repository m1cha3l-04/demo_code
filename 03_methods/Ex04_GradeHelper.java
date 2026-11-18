public class Ex04_GradeHelper {
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static String remark(double avg) {
        if (avg >= 75) {
            return "Passed";                       // leaves the method here
        }
        return "Failed";
    }

    public static void main(String[] args) {
        double avg = average(80, 72, 91);          // store the returned value
        System.out.println("Average: " + avg);
        System.out.println("Remark: " + remark(avg));          // use it directly
        System.out.println("Remark: " + remark(average(70, 68, 74)));
    }
}