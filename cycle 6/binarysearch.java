 import java.util.*;
 class BinarySearch {
    void searchElement(int array[], int target) {
        int left = 0, right = array.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                System.out.println("The element is found at index " + mid);
                found = true;
                break;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (!found) {
            System.out.println("The element is not found in the array.");
        }
    }
 }
 class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch searcher = new BinarySearch();
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Array length must be greater than 0.");
            return;
        }
        int[] array = new int[length];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("The sorted array is: " + Arrays.toString(array));
        System.out.print("Enter the search key: ");
        int key = scanner.nextInt();
        searcher.searchElement(array, key);
        scanner.close();
    }
 }
