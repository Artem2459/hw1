//public class hw5 {
//
//    public static String numberToString(int number) {
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 1; i <= 1000000; i++) {
//            result.append(number);
//        }
//
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        int inputNumber = 123;
//        String resultString = numberToString(inputNumber);
//        System.out.println(resultString);
//    }
//}
public class hw5 {

    public static void printRightAngledTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvertedRightAngledTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printEquilateralTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printInvertedEquilateralTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = height - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int triangleHeight = 5;

        System.out.println("Right Angled Triangle:");
        printRightAngledTriangle(triangleHeight);

        System.out.println("\nInverted Right Angled Triangle:");
        printInvertedRightAngledTriangle(triangleHeight);

        System.out.println("\nEquilateral Triangle:");
        printEquilateralTriangle(triangleHeight);

        System.out.println("\nInverted Equilateral Triangle:");
        printInvertedEquilateralTriangle(triangleHeight);
    }
}
