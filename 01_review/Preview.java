public class Preview{
    public static void main(String[] args){
        // System.out.println("Hello");
        int[] numbers = {4,8,15};
        int sum = 0;

        // for (int i = 0; i < numbers.length; i++) {
        //     sum += numbers[i];
        // }

        for (int n : numbers){
            sum += n;
        }

        if (sum > 20) {
            System.out.println("Big sum: " + sum);
        } else {
            System.out.println("Small sum: " + sum);
        }

    }
}