public class MyClass {

    //1.
    //public static void main(String[] args) {
    //
    //}


    public static void main(String[] args) {

        //2.
        byte theByte = 120; // 8 bits
        short theShort = 240; // 16 bits
        int theInt = 360; // 32 bits
        long theLong = 480L; // 64 bits

        char theChar = 600; // 16 bits

        float theFloat = 1.2f; // 32 bits
        double theDouble = 2.4; // 64 bits

        boolean theBoolean = true; // no specific size

        System.out.println(someMathMethod(2,2,4,2));

        System.out.println(isInRange(10,5));

        printTheSign(-100);

        System.out.println(isNegative(-100));

        helloTheName("Александр Александрович");

        printIfLeap(1700);

    }

    // 3.
    public static double someMathMethod(double a, double b, double c, double d) {
        return a * (b + (c/d));
    }

    // 4.
    public static boolean isInRange(int a, int b){
        int c = a + b;
        if ((c >= 10) && (c <= 20))
            return true;
        else return false;
    }

    // 5.
    public static void printTheSign(int a){
        if (a < 0)
            System.out.println("Negative");
        else
            System.out.println("Positive");
    }

    // 6.
    public static boolean isNegative(int a){
        return a < 0;
    }

    // 7.
    public static void helloTheName(String name){
        System.out.println("Привет," + name + "!");
    }

    //8.
    public static void printIfLeap(int year){
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
            System.out.println("Високосный год");
    }

    //9.
    //Это две разных сигнатуры одного метода.



}
