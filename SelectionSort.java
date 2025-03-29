import java.util.ArrayList;

public class SelectionSort {

    // Data Structure
    protected ArrayList<Integer>numbers = new ArrayList<>();
    
    // Constructor
    public SelectionSort(ArrayList<Integer>numbers){
        this.numbers = numbers;
    }

    // Sort the ArrayList
    public void sort(){

        int n = numbers.size();
        for (int i = 0; i < n-1; i++) {
            // We assume the current position is
            // the minimum
            int min = i;
            // Iterate to find the actual minimum
            for (int j = i+1; j < n; j++) {
                if (numbers.get(j) < numbers.get(min)){
                    // Update the minimum
                    min = j;
                }
            }
            // Move the minimum to the correct position
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(min));
            numbers.set(min, temp);
            
        }
    }

    // Print 
    public void print(){
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
