// package 03_methods;

public class Ex01_CallOrder {
    public static void main(String[] args) {
        System.out.println("main starts");
        stepOne();
        System.out.println("main ends");
    }

    public static void stepOne() {
        System.out.println("stepOne starts");
        stepTwo();
        System.out.println("stepOne ends");
    }

    public static void stepTwo() {
        System.out.println("stepTwo runs");
    }
}
