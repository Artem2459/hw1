import java.util.Arrays;

public class hw6 {

    // Знайти суму всіх елементів двовимірного масиву
    public static int sumOfElements(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    // Знайти середнє арифметичне значення всіх елементів масиву
    public static double averageOfElements(int[][] array) {
        int sum = sumOfElements(array);
        return (double) sum / (array.length * array[0].length);
    }

    // Знайти найбільший елемент в кожному рядку масиву
    public static int[] maxInEachRow(int[][] array) {
        int[] maxValues = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxValues[i] = max;
        }
        return maxValues;
    }

    // Знайти найменший елемент в кожному стовпці масиву
    public static int[] minInEachColumn(int[][] array) {
        int[] minValues = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            minValues[j] = min;
        }
        return minValues;
    }

    // Знайти суму елементів кожного рядка масиву
    public static int[] sumInEachRow(int[][] array) {
        int[] sums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    // Перевірити, чи є усі елементи головної діагоналі масиву додатніми
    public static boolean allPositiveInMainDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] <= 0) {
                return false;
            }
        }
        return true;
    }

    // Поміняти місцями два рядки масиву
    public static void swapRows(int[][] array, int row1, int row2) {
        int[] temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;
    }

    // Знайти суму елементів в рядках, де є хоча б одне від'ємне число
    public static int sumInRowsWithNegative(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            boolean hasNegative = false;
            for (int element : row) {
                if (element < 0) {
                    hasNegative = true;
                    break;
                }
            }
            if (hasNegative) {
                for (int element : row) {
                    sum += element;
                }
            }
        }
        return sum;
    }

    // Знайти кількість парних чисел в масиві
    public static int countEvenNumbers(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Знайти кількість від'ємних чисел в масиві
    public static int countNegativeNumbers(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Замінити всі нульові елементи масиву на числа починаючи з 1, і кожен наступний нуль
    // міняйте на число на один більше
    public static void replaceZeros(int[][] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = count++;
                }
            }
        }
    }

    // Визначити, чи є сумма лівої і правої діагоналі масива однаковими
    public static boolean diagonalsEqual(int[][] array) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i][i];
            rightSum += array[i][array.length - 1 - i];
        }
        return leftSum == rightSum;
    }

    // Знайти суму елементів, розташованих на лівій діагоналі масиву
    public static int sumLeftDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    // Знайти кількість елементів, які менше заданого числа
    public static int countElementsLessThan(int[][] array, int number) {
        int count = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element < number) {
                    count++;
                }
            }
        }
        return count;
    }

    // Перевірити, чи є всі елементи масиву унікальними
    public static boolean allUnique(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = i; k < array.length; k++) {
                    for (int l = (k == i) ? j + 1 : 0; l < array[k].length; l++) {
                        if (array[i][j] == array[k][l]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Виклик методів для виконання задач
        System.out.println("Сума всіх елементів масиву: " + sumOfElements(array));
        System.out.println("Середнє арифметичне значення елементів масиву: " + averageOfElements(array));
        System.out.println("Найбільший елемент в кожному рядку масиву: " + Arrays.toString(maxInEachRow(array)));
        System.out.println("Найменший елемент в кожному стовпці масиву: " + Arrays.toString(minInEachColumn(array)));
        System.out.println("Сума елементів кожного рядка масиву: " + Arrays.toString(sumInEachRow(array)));
        System.out.println("Усі елементи головної діагоналі масиву додатні: " + allPositiveInMainDiagonal(array));
        swapRows(array, 0, 1);
        System.out.println("Поміняли місцями перший і другий рядки масиву: " + Arrays.deepToString(array));
        System.out.println("Сума елементів в рядках, де є хоча б одне від'ємне число: " + sumInRowsWithNegative(array));
        System.out.println("Кількість парних чисел в масиві: " + countEvenNumbers(array));
        System.out.println("Кількість від'ємних чисел в масиві: " + countNegativeNumbers(array));
        replaceZeros(array);
        System.out.println("Замінили всі нульові елементи масиву: " + Arrays.deepToString(array));
        System.out.println("Сума лівої діагоналі масиву: " + sumLeftDiagonal(array));
        System.out.println("Кількість елементів, які менше заданого числа: " + countElementsLessThan(array, 5));
        System.out.println("Усі елементи масиву унікальні: " + allUnique(array));
    }
}
