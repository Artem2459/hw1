public class hw8 {

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fib(n);
        System.out.println("Число Фібоначчі для n = " + n + " дорівнює: " + result);
    }
}
