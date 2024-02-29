import java.util.*;

public class hw13 {
    public static void main(String[] args) {
        // Завдання 1
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        sortNumbers(numbers, SortOrder.ASCENDING);
        System.out.println("Sorted numbers in ascending order: " + numbers);

        // Завдання 2
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple", "banana"));
        removeDuplicates(strings);
        System.out.println("List after removing duplicates: " + strings);

        // Завдання 3:
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(10, 5, 8, 3, 12));
        findMinMax(numbers2);

        // Завдання 4:
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        mergeLists(list1, list2);
        System.out.println("Merged list without duplicates: " + list1);

        // Завдання 5:
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        checkElementExistence(names, "Charlie");
        checkElementExistence(names, "Eve");
    }


    enum SortOrder {
        ASCENDING,
        DESCENDING
    }

    // Завдання 1:
    public static void sortNumbers(List<Integer> numbers, SortOrder order) {
        if (order == SortOrder.ASCENDING) {
            numbers.sort(Comparator.naturalOrder());
        } else {
            numbers.sort(Comparator.reverseOrder());
        }
    }

    // Завдання 2:
    public static void removeDuplicates(List<String> strings) {
        Set<String> set = new LinkedHashSet<>(strings);
        strings.clear();
        strings.addAll(set);
    }

    // Завдання 3:
    public static void findMinMax(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

    // Завдання 4:
    public static void mergeLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>(list1);
        set.addAll(list2);
        list1.clear();
        list1.addAll(set);
    }

    // Завдання 5:
    public static void checkElementExistence(List<String> list, String element) {
        if (list.contains(element)) {
            System.out.println("Element '" + element + "' is present in the list.");
        } else {
            System.out.println("Element '" + element + "' is not present in the list.");
        }
    }
}
