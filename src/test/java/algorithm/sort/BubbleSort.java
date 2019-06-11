package algorithm.sort;

public class BubbleSort {
    public static void sort2(int[] array) {
        for(int i = 0; i < array.length; i++){
            boolean isSorted = true;
            for(int j = 0; j < array.length - 1; j++) {
                int temp = 0;
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    isSorted = false;
                }
            }

            if(isSorted) {
                break;
            }
        }
    }

    public static void sort3(int[] array) {
        for(int i = 0; i < array.length; i++){
            boolean isSorted = true;
            int sortBorder = array.length - 1;
            for(int j = 0; j < sortBorder; j++) {
                int temp = 0;
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    isSorted = false;
                    sortBorder = j;
                }
            }

            if(isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,3,2,6,3,8,5,9};
        sort2(array);
        System.out.println(array);
    }
}

