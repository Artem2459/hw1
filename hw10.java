import java.util.Arrays;

public class hw10 {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static String[] stringToWordsArray(String str) {
        return str.split("\\s+");
    }

    public static void main(String[] args) {
        // Приклад використання:
        String input = "hello world";

        System.out.println("1. Реверс рядка: " + reverseString(input));
        System.out.println("2. Кількість голосних літер: " + countVowels(input));
        System.out.println("3. Чи є паліндромом: " + isPalindrome(input));
        System.out.println("4. Без дублікатів: " + removeDuplicates(input));
        System.out.println("5. Масив слів: " + Arrays.toString(stringToWordsArray(input)));
    }
}
