////1.public class hw4 {
////    public static void main(String[] args) {
////        for (int i = 1; i <= 55; i++) {
////            System.out.print((2 * i - 1) + " ");
////        }
////    }
////}
//2.public class hw4 {
//    public static void main(String[] args) {
//        printNonNegativeElements();
//    }
//
//    static void printNonNegativeElements() {
//        for (int i = 90; i >= 0; i -= 5) {
//            System.out.print(i + " ");
//        }
//    }
//}
//3.public class hw4 {
//    public static void main(String[] args) {
//        printSequence();
//    }
//
//    static void printSequence() {
//        int num = 2;
//        for (int i = 0; i < 20; i++) {
//            System.out.print(num + " ");
//            num *= 2;
//        }
//    }
//}
//4.public class hw4 {
//    public static void main(String[] args) {
//        printMultiplesOfFive();
//    }
//
//    static void printMultiplesOfFive() {
//        for (int i = -29; i <= 10; i++) {
//            if (i % 5 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}
//5.public class hw4 {
//    public static void main(String[] args) {
//        int sum = 0;
//        int count = 0;
//
//        for (int i = 50; i <= 150; i++) {
//            sum += i;
//            if (i % 2 == 0) {
//                count++;
//            }
//        }
//
//        System.out.println("Сума: " + sum);
//        System.out.println("Кількість парних чисел: " + count);
//    }
//}
//доп.    public class hw4 {
//
//
//    public static void main(String[] args) {
//        int[] array = {1, 7, 3, 9, 5};
//        int max = findMaxValue(array);
//        System.out.println("Найбільше значення у масиві: " + max);
//    }
//
//    public static int findMaxValue(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            throw new IllegalArgumentException("Масив не повинен бути порожнім або нульовою посиланням.");
//        }
//
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//}
