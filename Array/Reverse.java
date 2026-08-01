public class Reverse {
    public static void reverseArray(int numbers[]) {
        int first = 0 , last = numbers.length - 1;

        while(first < last) {
            // Swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    
    public static void main(String [] args) {
        int numbers[] = {2, 10, 30, 31, 50, 60};
        
        reverseArray(numbers);

        // Print Reverse Array
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}