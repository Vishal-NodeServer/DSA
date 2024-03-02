public class LinearSearch1 {

    public static void main(String args[]) {
        int[] array = {1, 3, 4, 7, 8, 9};
        int targetValue = 8;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                System.out.println("Element found at index: " + i);
                return; // exit the program if the element is found
            }
        }

        System.out.println("Sorry, there is no such element");
    }
}
