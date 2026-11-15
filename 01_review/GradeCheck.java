public class GradeCheck {
    public static void main(String[] args) {
        int score = 65;
        String letter = "X";

        // if (score >= 90) {
        //     letter = "A";
        // } else if (score >= 80) {
        //     letter = "B";
        // } else if (score >= 70) {
        //     letter = "C";
        // } else {
        //     letter = "F";
        // }

        if (score >= 90) {
            letter = "A";
            System.out.println("inside if block?");
        } else {
            letter = "B";
        }

        System.out.println("Your grade is " + letter);
    }
}
