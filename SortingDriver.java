import java.io.*;
import java.util.*;
public class SortingDriver{
    public static void main(String[]args){

        // Data structure to hold the numbers from the file
        ArrayList<Integer>numbers = new ArrayList<>();
        Scanner stdIn = new Scanner(System.in);
        String fileName;

        // Read numbers from the file
        try{
            System.out.println("Enter the name of the file: ");
            fileName = stdIn.nextLine();
            Scanner scanner = new Scanner(new File("Data/"+fileName));
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found"); 
            return;
        }
        
        // User input
        System.out.println("Which sorting algorithm do you want to use?");
        System.out.println("Press s for selection sort or m for merge sort");
        String userInput = stdIn.next();

        if (userInput.equalsIgnoreCase("s")) {
            // Selection Sort
            System.out.println("Reading data from file...");
            SelectionSort selection = new SelectionSort(numbers); 
            confirmSorted(numbers);
            System.out.println("Sorting using Selection sort");
            long start = System.currentTimeMillis(); // Record start time
            // Sort
            selection.sort();
            long end = System.currentTimeMillis();
            System.out.println("Execution time: " + (end-start) + " ms.");
            confirmSorted(numbers);

        } else if (userInput.equalsIgnoreCase("m")) {
            // Mergesort
            System.out.println("Reading data from file...");
            MergeSort merge = new MergeSort(); 
            confirmSorted(numbers);
            System.out.println("Sorting using Merge Sort");
            long start = System.currentTimeMillis(); // Record start time
            // Sort
            merge.sort(numbers, 0, numbers.size()-1);
            long end = System.currentTimeMillis();
            System.out.println("Execution time: " + (end-start) + " ms.");
            confirmSorted(numbers);


        } else {
            System.out.println("Wrong Input, bye!");
        }
    }

    // Helper method to verify numbers are sorted
    private static void confirmSorted(ArrayList<Integer>numbers){
        // Flag
        boolean sorted = true;
        // Iterate
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i+1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Confirmed Sorted");
        } else {
            System.out.println("Confirmed NOT Sorted");
        }
    }
}
