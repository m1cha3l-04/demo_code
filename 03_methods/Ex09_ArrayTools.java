public class Ex09_ArrayTools {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];                          // start with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] reversedCopy(int[] arr) {
        int[] result = new int[arr.length];        // a brand-new array
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] steps = {4200, 6100, 3900, 7500};
        printArray(steps);
        System.out.println("Sum: " + sum(steps));
        System.out.println("Max: " + findMax(steps));
        int[] back = reversedCopy(steps);
        printArray(back);
        printArray(steps);                         // the original is unchanged
    }
}