public class cls4 {

    public static void main(String[] args) {
        int val = 5;
        int[] arr = {-1, -3, -5, -4};
        int[] arr2 = {11, 3, 5};
        min(arr2);
        min(arr);
    }

    public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
    }
}



//
//task2(3);
//task2(6);
//    }
//    public static void task2(int a ){
//for (int i = 0; i < 10 ; i++);
//int  sum = 0;
//            System.out.println(i);


//
//        for (int i = 90 ; i>- 1 ; i-= 5 )
//            System.out.println( i);
//    }

