# Selection-Sort-vs-Merge-Sort
Implementation and comparison of two sorting algorithms, the first algorithm is Selection Sort O(N^2) and the second algorithm is Merge Sort O(nlogn). They are implemented to sort numbers in ascending order (smallest to largest).

The SortingDriver class reads the numbers in text files from the Data folder, user input is required to specify the exact name of the file to be sorted.

**Data analysis**

![image](https://github.com/user-attachments/assets/a79980f7-6906-4ece-a96f-7a07e7ef021f)

![image](https://github.com/user-attachments/assets/8bf03f66-ce73-4564-9ed0-c4ea287c56d1)


The previous implementation and data from the program showcase the clear difference in performance and efficiency between the two algorithms. Selection sort presents a straightforward structure; however, in terms of performance, it is not very efficient. It sorts the smaller files almost instantly, but as the files get bigger, the time it takes to sort them increases exponentially, making it basically useless after the 100-k threshold. Merge sort on the other hand presents a stable implementation with subtle and constant increases in time, being able to sort all of the files provided.

