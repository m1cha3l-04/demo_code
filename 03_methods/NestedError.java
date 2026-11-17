public class NestedError {
    public static void main(String[] args) {
        public static void sayHi() {               // a method INSIDE main!
            System.out.println("Hi");
        }
        sayHi();
    }
}