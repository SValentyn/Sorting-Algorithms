/**
 * The implementation class of many sorting algorithms.
 *
 * @author Syniuk Valentyn
 */
class Sorts {

    private int[] array;

    Sorts(int[] array) {
        this.array = array;
    }

    int[] getArray() {
        return array;
    }

    void bubble() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    void selection() {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) maxIndex = j;
            }
            int tmp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = tmp;
        }
    }

    void insertion() {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int tmp = array[j];
            while (j > 0 && tmp > array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
        }
    }

    void comb() {
        int jump = array.length;
        while (jump > 1) {
            jump = (int) (jump / 1.25);

            for (int i = 0; i + jump < array.length; i++) {
                if (array[i] > array[i + jump]) {
                    int tmp = array[i];
                    array[i] = array[i + jump];
                    array[i + jump] = tmp;
                }
            }
        }
    }

    void shell() {
        int i, j, d, count;
        d = array.length;
        d = d / 2;
        while (d > 0) {
            for (i = 0; i < array.length - d; i++) {
                j = i;
                while (j >= 0 && array[j] > array[j + d]) {
                    count = array[j];
                    array[j] = array[j + d];
                    array[j + d] = count;
                    j--;
                }
            }
            d = d / 2;
        }
    }

    void stooge(int i, int j) {
        if (i >= j)
            return;

        // If first element is smaller than last,swap them
        if (array[i] > array[j]) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        // If there are more than 2 elements in the array
        if (j - i + 1 > 2) {
            int k = (j - i + 1) / 3;

            // Recursively sort first 2/3 elements
            stooge(i, j - k);

            // Recursively sort last 2/3 elements
            stooge(i + k, j);

            // Recursively sort first 2/3 elements
            stooge(i, j - k);
        }
    }

    void quick(int left, int right) {
        if (left < right) {
            int boundary = left;
            for (int i = left + 1; i < right; i++) {
                if (array[i] > array[left]) {
                    swap(i, ++boundary);
                }
            }
            swap(left, boundary);
            quick(left, boundary);
            quick(boundary + 1, right);
        }
    }

    void shaker() {
        for (int i = 0; i < array.length / 2; i++) {
            boolean swapped = false;
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            for (int j = array.length - 2 - i; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    void gnome() {
        int position = 0;

        while (position < array.length) {
            if (position == 0 || array[position - 1] <= array[position]) {
                position++;
            } else {
                swap(array[position - 1], position);
                position--;
            }
        }
    }

    /**
     * Swaps the elements of the array
     */
    private void swap(int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }

}
