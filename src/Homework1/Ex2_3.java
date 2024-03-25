package Homework1;

public class Ex2_3 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, null, 4, 5, null, 7, 8, 9, 10};

        for (int i = 1; i < array.length; i += 2) {
            if (array[i] == null) {
                break;
            }
            System.out.println(array[i]);
        }
    }
}
