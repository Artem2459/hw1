////1.import java.util.Scanner;
////
////public class hw2 {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Введите значение переменной a: ");
////        int a = scanner.nextInt();
////
////        if (a == 0) {
////            System.out.println("Верно");
////        } else {
////            System.out.println("Неверно");
////        }
////    }
////}
//
//2.import java.util.Scanner;
//
//public class hw2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите значение переменной a: ");
//        int a = scanner.nextInt();
//
//        if (a > 0) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//3.import java.util.Scanner;
//
//public class hw2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите значение переменной a: ");
//        int a = scanner.nextInt();
//
//        if (a < 0) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//
//      4.  import java.util.Scanner;
//
//public class hw2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите значение переменной a: ");
//        int a = scanner.nextInt();
//
//        if (a >= 0) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//
//       5. import java.util.Scanner;
//
//public class hw2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите значение переменной a: ");
//        int a = scanner.nextInt();
//
//        if (a <= 0) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//
//6.import java.util.Scanner;
//
//public class hw2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите значение переменной a: ");
//        int a = scanner.nextInt();
//
//        if (a != 0) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//7.import java.util.Scanner;
//
//public class hw2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите значение переменной a: ");
//        int a = scanner.nextInt();
//
//        if (a == 0) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//8.public class hw2 {
//    public static void main(String[] args) {
//        checkValueAndType("1");
//        checkValueAndType(1);
//        checkValueAndType(3);
//    }
//
//    public static void checkValueAndType(Object a) {
//        if (a.equals("1") && a.getClass() == String.class) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//9.public class hw2 {
//    public static void main(String[] args) {
//        boolean test1 = true;
//        boolean test2 = false;
//
//        checkAndPrintIf(test1);
//        checkAndPrintIf(test2);
//    }
//
//    public static void checkAndPrintIf(boolean test) {
//        if (test) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//10.public class hw2 {
//    public static void main(String[] args) {
//        boolean test1 = true;
//        boolean test2 = false;
//
//        checkAndPrintIf(test1);
//        checkAndPrintIf(test2);
//    }
//
//    public static void checkAndPrintIf(boolean test) {
//        if (!test) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//11.public class hw2 {
//    public static void main(String[] args) {
//        checkAndPrint(5);
//        checkAndPrint(0);
//        checkAndPrint(-3);
//        checkAndPrint(2);
//    }
//
//    public static void checkAndPrint(int a) {
//        if (a > 0 && a < 5) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//12.public class hw2 {
//    public static void main(String[] args) {
//        processAndPrint(5);
//        processAndPrint(0);
//        processAndPrint(-3);
//        processAndPrint(2);
//    }
//
//    public static void processAndPrint(int a) {
//        if (a == 0 || a == 2) {
//            a += 7;
//        } else {
//            a /= 10;
//        }
//        System.out.println("Новое значение переменной: " + a);
//    }
//}
//13.public class hw2 {
//    public static void main(String[] args) {
//        checkAndPrint(1, 3);
//        checkAndPrint(0, 6);
//        checkAndPrint(3, 5);
//    }
//
//    public static void checkAndPrint(int a, int b) {
//        if (a <= 1 && b >= 3) {
//            int sum = a + b;
//            System.out.println("Сумма переменных: " + sum);
//        } else {
//            int difference = a - b;
//            System.out.println("Разность переменных: " + difference);
//        }
//    }
//}
//14.public class hw2 {
//    public static void main(String[] args) {
//        checkAndPrint(5, 8);
//        checkAndPrint(1, 10);
//        checkAndPrint(3, 14);
//    }
//
//    public static void checkAndPrint(int a, int b) {
//        if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//}
//15.public class hw2 {
//    public static void main(String[] args) {
//        int seasonCode = 3;
//
//        String result = getSeasonDescription(seasonCode);
//        System.out.println(result);
//    }
//
//    public static String getSeasonDescription(int seasonCode) {
//        String result;
//
//        switch (seasonCode) {
//            case 1:
//                result = "зима";
//                break;
//            case 2:
//                result = "весна";
//                break;
//            case 3:
//                result = "лето";
//                break;
//            case 4:
//                result = "осень";
//                break;
//            default:
//                result = "неверное значение";
//                break;
//        }
//
//        return result;
//    }
//}
