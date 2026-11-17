public class Greeter {
    public static void greet(String name, int times) {   // two parameters
        for (int i = 1; i <= times; i++) {
            System.out.println(i + ". Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        greet("Ana", 2);                           // two arguments
        String student = "Ben";
        greet(student, 1);                         // a variable as an argument
    }
}