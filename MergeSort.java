/**
 * Created by joshuasander on 2/19/17.
 */
import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int [] a1)
    {
        //Create the temporary array to store new values in.  Space complexity: O(n)
        int [] a2 = new int[a1.length];
        //Wrapper function calls recursive algorithm
        mergeSort(a1, a2, 0, (a1.length - 1));
    }

    public void mergeSort(int [] a1, int [] a2, int left, int right)
    {
        int middle = (left + right) / 2;

        //Base case for smallest division
        if (left >= right)
            return;

        mergeSort(a1, a2, left, middle);
        mergeSort(a1, a2, (middle + 1), right);
        merge(a1, a2, left, right);
    }

    public void merge(int [] a1, int [] a2, int left, int right) {
        int size = right - left + 1; //Determine size of this partition
        int leftEdge = (left + right) / 2; //Left partition ends here
        int rightBegin = leftEdge + 1; //Right partition begins here

        int leftIndex = left;  //Establish index for traversing partition
        int rightIndex = rightBegin; //Same as above
        int index = left; //Index for the temporary array

        //This requires n (log n) comparisons
        while (leftIndex <= leftEdge && rightIndex <= right)
        {
            if (a1[leftIndex] <= a1[rightIndex])
            {
                a2[index] = a1[leftIndex];
                leftIndex++;
            }
            else
            {
                a2[index] = a1[rightIndex];
                rightIndex++;
            }
            index++;
        }

        //Java functions to copy an array.
        //Array copy specifies (source, starting index, destination, starting index, amount to copy)
        System.arraycopy(a1, leftIndex, a2, index, (leftEdge - leftIndex + 1));
        System.arraycopy(a1, rightIndex, a2, index, (right - rightIndex + 1));
        System.arraycopy(a2, left, a1, left, size);

        System.out.println(Arrays.toString(a1));

        //This requires n(log n) copy operations
    }

}
