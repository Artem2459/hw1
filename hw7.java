public class hw7 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Відсортований масив:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

//Умова:
//Даний відсортований масив nums і цільове число target. Поверніть індекс, де ця цифра повинна бути вставлена в масив, так, щоб масив залишився відсортованим. Можливо, що в масиві можуть бути дублікати.
//
//Приклад:
//Input: nums = [1,3,5,6], target = 5
//Output: 2
