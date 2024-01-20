package view;

public class Ex04NumberStatistic {
    public static void main(String[] args) {
        int[] numbers = { 3, 15, 2, 16, 15, 17, 21 };
        int[] a = new int[30];

        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }

        for (int i = 0; i < numbers.length; i++) {
            a[numbers[i]]++;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (a[numbers[i]] == 1) {
                System.out.println(numbers[i]);
            }
        }
    }
}

