public class DayName {
    public static void main(String[] args) {
        char day = 'X';
        String name = "";

        switch (day) {
            case 'M':
                name = "Monday";
                break;  
            case 'T':
                name = "Tuesday";
                break;
            case 'W':
                name = "Wednesday";
                break;
            
            default:
                name = "No day!";
                break;
        }
        System.out.println(name);
    }
}