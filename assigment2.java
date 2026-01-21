java.util.Scanner;

class Assignment2 {

    // Find missing element
    public static int missingElement(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return totalSum - sum;
    }

    // Bubble Sort
    public static void sorting(int[] import arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Search element 
    public static int searchingElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


 // Find largest element
    public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }


    // Find smallest element
    public static int smallestElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }


    // Find pair with given sum
    public static void findPair(int[] arr, int target) {
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("No pair found");
        }
    }


    // Main Method
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);





        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            

      System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        // Sorting
        sorting(arr);
        System.out.print("\nSorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Largest & Smallest

        System.out.println("Largest Element: " + largestElement(arr));

        System.out.println("Smallest Element: " + smallestElement(arr));


        // Searching
        System.out.print("Enter element to search: ");

        int key = sc.nextInt();
        int index = searchingElement(arr, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");

        // Find Pair
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        findPair(arr, target);

    }
}



