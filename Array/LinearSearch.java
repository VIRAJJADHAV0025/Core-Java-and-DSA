//import java.util.*;
public class LinearSearch {
    // Linear Search
    public static int linearSearch(int numbers[], int key) {
        for(int i =0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 16};
        int key = 121;

        int index = linearSearch(numbers, key);

        if(index == -1) {
            System.out.println("KEY NOT FOUND...");
        }else {
            System.out.println("Key Found at index " + index);
        }


    }
}