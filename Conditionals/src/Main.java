public class Main {

    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch(opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(result);

        int students = 150;
        int rooms = 0;
        //because we had the logical operator &&, the first part was false,
        //so the rest of the equation was not evaluated.
        if(rooms != 0 && students/rooms > 30)
            System.out.print("Crowded");
    }
}