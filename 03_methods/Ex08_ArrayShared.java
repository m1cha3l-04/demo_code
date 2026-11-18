public class Ex08_ArrayShared {
    public static void addBonus(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;                   // changes the shared array
        }
    }

    public static void replace(int[] arr) {
        arr = new int[] {0, 0, 0};                 // only the local copy moves
    }

    public static void main(String[] args) {
        int[] quiz = {70, 80, 90};
        addBonus(quiz);
        System.out.println(quiz[0] + " " + quiz[1] + " " + quiz[2]);
        replace(quiz);
        System.out.println(quiz[0] + " " + quiz[1] + " " + quiz[2]);
    }
}