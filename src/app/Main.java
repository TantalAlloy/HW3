package app;

public class Main {
    public static void main(String[] args) {

                int[] array = {53, 78, 13, 9, 5, 17, 28, 719, 214};
                for (int i=0; i<array.length; i++) {
                    int d = array[i] % 2;
                    if (d == 0) {
                        System.out.println(array[i]);
                    }
        }
    }
}