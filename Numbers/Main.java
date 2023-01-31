package JavaCore.StreamAPI.ExcersizeOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveEvenNumbers = new ArrayList();
        for (int x : intList) {
            if (x > 0 && x % 2 == 0) {
                positiveEvenNumbers.add(x);
            }
        }
        System.out.println(Arrays.toString(bubbleSort(positiveEvenNumbers)));
    }


    public static Integer[] bubbleSort(List positiveEvenNumbers) {
        Integer[] arr = (Integer[]) positiveEvenNumbers.toArray(new Integer[positiveEvenNumbers.size()]);
        for (int j = 0; j < arr.length - 1; j++) {
            for (int l = 0; l < arr.length - 1 - j; l++) {
                if (arr[l] > arr[l + 1]) {
                    int g = arr[l];
                    arr[l] = arr[l + 1];
                    arr[l + 1] = g;
                }
            }
        }
        return arr;
    }

}




