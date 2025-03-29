import java.util.ArrayList;

public class MergeSort {

    public void merge(ArrayList<Integer>numbers, int lo, int mid, int hi){

        // Find size of the two subarrays to be merged
        int s1 = mid -lo +1;
        int s2 = hi - mid;

        // Create temporary arrayLists
        ArrayList<Integer>left = new ArrayList<>();
        ArrayList<Integer>right = new ArrayList<>();

        // Copy elements to temp arrayLists
        for (int i = 0; i < s1; i++) {
            left.add(numbers.get(lo+i));
        }
        for (int i = 0; i < s2; i++) {
            right.add(numbers.get(mid+1+i));
        }

        // Merge the temp arrayLists

        int i = 0, j = 0; // Initial indices of first and second sublists

        // Initial index of merged subarray arrayList
        int k = lo;
        while (i < s1 && j < s2) {
            if (left.get(i) <= right.get(j)) {
                numbers.set(k, left.get(i));
                i++;

            } else {
                numbers.set(k, right.get(j));
                j++;
            }
            k++;
        }

        // Copy remaining elements of left if any
        while (i < s1) {
            numbers.set(k, left.get(i));
            i++;
            k++;
        }

        // Copy remaining elements of right if any
        while (j < s2) {
            numbers.set(k, right.get(j));
            j++;
            k++;
        }  
    }

    // Sorting function that uses merge()
    public void sort(ArrayList<Integer>numbers, int lo, int hi){

        // Base case
        if (hi<=lo) {
            return;
        }
        // Find the middle point
        int mid = lo + (hi - lo) / 2;
        // Sort recursively
        sort(numbers, lo, mid);
        sort(numbers, mid+1, hi);

        // Merge
        merge(numbers, lo, mid, hi);
    }

}
