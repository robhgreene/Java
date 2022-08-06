public class Main {

    public static void main(String[] args) {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;

        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result5 = byteVal;

        /*
        short result6 = longVal;
        here, the compiler will get mad because you are trying to make a narrow conversion.
         */

        short result7 = (short) longVal;
        System.out.println(result7);

        /*
        short result8 = byteVal - longVal;
        here we have another instance of a long type tying to be assigned to a short type
        */

        short result8 = (short) longVal;
        System.out.println(result8);

        /*
        long result9 = longVal - floatVal;
        needs a long to be stored, but found a float
        */

        System.out.println("Success");
    }
}
