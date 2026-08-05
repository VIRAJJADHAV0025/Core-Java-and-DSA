// Prerequisite - Sorted Array
public class BinarySearch {
    public static int binarySearchKey(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {
            int mid = start - (start - end) / 2;
            
            // Comparision
            if(numbers[mid] == key) {
                return mid;
            }else if(numbers[mid] < key) { // Right
                start = mid + 1;
            }else {                        // Left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 16};
        int key = 12;

        System.out.println("Index of key is " + binarySearchKey(numbers, key));
        


    }
}