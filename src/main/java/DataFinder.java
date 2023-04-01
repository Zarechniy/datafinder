public class DataFinder {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 41) - 20);
            System.out.println(array[i]);
        }

        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальное значение " + min);

        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное значение " + max);

        System.out.println("Большее по модулю");
        System.out.println(Math.abs(min) >= Math.abs(max)? min: max);
    }
}
