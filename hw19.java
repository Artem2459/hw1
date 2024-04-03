import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class hw19 {
    private List<Integer> numbers;

    public hw19() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void processList() {
        if (numbers.isEmpty()) {
            System.out.println("Список чисел порожній.");
            return;
        }

    
        int sumOfEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сума всіх парних чисел: " + sumOfEvenNumbers);


        List<Integer> multipliedList = numbers.stream()
                .map(num -> num * 2)
                .toList();
        System.out.println("Результат множення на 2: " + multipliedList);


        int maxNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println("Максимальне число: " + maxNumber);


        String oddNumbersString = numbers.stream()
                .filter(num -> num % 2 != 0)
                .map(Object::toString)
                .reduce((num1, num2) -> num1 + "," + num2)
                .orElse("");
        System.out.println("Непарні числа: " + oddNumbersString);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Середнє арифметичне: " + average);
    }

    public static void main(String[] args) {
        hw19 processor = new hw19();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть ціле число (або 'exit' для завершення): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                processor.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Введено некоректне число. Будь ласка, спробуйте ще раз.");
            }
        }

        processor.processList();
        scanner.close();
    }
}

