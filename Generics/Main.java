package Generics;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(30);
            list.add(array[i]);
        }
        System.out.print("\n[");
        for(int number : array){
            // print(number)
            System.out.printf("%d,", number); 
        } 
        System.out.print("]\n");
        System.out.print("Elements in a list\n[");
        for(int number : list){
            // print(number)
            System.out.printf("%d,", number); 
        }
        System.out.print("]\n");
        Arrays.sort(array);
        Collections.sort(list);
        System.out.print("Sorted Elements in a list\n[");
        for (Integer integer : list) {
            System.out.printf("%d,", integer); 
        }
        System.out.print("]\n");
        System.out.print("Sorted Elements in an array\n[");
        for (Integer integer : array) {
            System.out.printf("%d,", integer); 
        }
        System.out.print("]");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an element to search: ");
        int element = scanner.nextInt();
        
        // Search in array
        boolean foundInArray = false;
        for (int number : array) {
            if (number == element) {
            foundInArray = true;
            break;
            }
        }
        System.out.println("Element " + (foundInArray ? "found" : "not found") + " in array.");
        
        // Search in list
        boolean foundInList = list.contains(element);
        System.out.println("Element " + (foundInList ? "found" : "not found") + " in list.");
        // Remove duplicates
        HashSet<Integer> set = new HashSet<>(list);

        System.out.printf("\nThe Hashset has the following elements"); 
        for(Integer integer : set){
            System.out.printf("%d,", integer); 
        }
        // Determine the minimum and maximum elements in the array
        int minArray = array[0];
        int maxArray = array[0];
        for (int number : array) {
            if (number < minArray) {
            minArray = number;
            }
            if (number > maxArray) {
            maxArray = number;
            }
        }
        System.out.printf("\nMinimum element in array: %d", minArray);
        System.out.printf("\nMaximum element in array: %d", maxArray);

        // Determine the minimum and maximum elements in the list
        int minList = list.get(0);
        int maxList = list.get(0);
        for (int number : list) {
            if (number < minList) {
            minList = number;
            }
            if (number > maxList) {
            maxList = number;
            }
            System.out.printf("\nMinimum element in list: %d", minList);
            System.out.printf("\nMaximum element in list: %d", maxList);

            // Determine the number of occurrences of each unique element in the list
            Map<Integer, Integer> occurrences = new HashMap<>();
            for (int value : list) {
                occurrences.put(value, occurrences.getOrDefault(value, 0) + 1);
            }

            // Present the results in tabular format
            System.out.println("\nElement\tOccurrences");
            for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
                System.out.printf("%d\t%d\n", entry.getKey(), entry.getValue());
            }
        }
       

        // Test the generic method with an integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Enter an integer to search in the integer array: ");
        int intElement = scanner.nextInt();
        boolean foundInt = searchElement(intArray, intElement);
        System.out.println("Element " + (foundInt ? "found" : "not found") + " in integer array.");

        // Test the generic method with a double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Enter a double to search in the double array: ");
        double doubleElement = scanner.nextDouble();
        boolean foundDouble = searchElement(doubleArray, doubleElement);
        System.out.println("Element " + (foundDouble ? "found" : "not found") + " in double array.");
        scanner.close();
    }
     // Generic method to search for an element in an array
    public static <T> boolean searchElement(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
