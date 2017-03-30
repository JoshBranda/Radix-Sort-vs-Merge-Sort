/**
 * Created by joshuasander on 2/20/17.
 */
public class RadixSort {

    public void radixSort(int [] a, int n)
    {
        //First, find the largest element in the array to know what the most significant digit will be
       int b = biggestNum(a, n);//This requires N comparisons
        int [] a2 = new int[n];//Creates a new array of equal size to the original. Space complexity: O(n)

       //This loop begins at the least significant digit and increments up until it passes the most significant digit
        //in the largest element of the array.
       for (int digitPlace = 1; b / digitPlace != 0; digitPlace *= 10) //This requires D loops where D is highest number of digits
       {
            int [] bucket = new int[10]; //Java initializes to 0
            int index = 0;

            //This tallies the count of each number 0-9 which has a corresponding digit in the element
            for (int x = 0; x < n; x++)
                bucket[ ( (a[x]/digitPlace) % 10) ]++;//This requires N operations.

            //This adds the index value of the previous bucket.
            //Essentially, it converts separate buckets into a single large index of partitioned buckets
            for (int x = 1; x < 10; x++)
                bucket[x] += bucket[x-1];//This requires 10 operations.

            //Starting at the end of the original array, this begins inserting elements into the copy array based on their index
           //Example: Partition[0]: 0, 1...6  Partition[1]: 7, 8...10
           //If element at a[x] is found to belong to Partition[1], then it is placed at index 10 in the copy
           //and Partition[1] is decremented down to 7, 8, 9
            for (int x = n -1; x >= 0; x--) //This requires N operations.
            {
                index = ((a[x] / digitPlace) % 10);
                a2[ bucket[index] - 1] = a[x];
                bucket[index]--;
            }

            //With the copy array now arranged appropriately by the current digit place, the data is copied back into the original array
            for (int x = 0; x < n; x++) //This requires N assignments.
                a[x] = a2[x];
       }
    }

    public int biggestNum(int [] a, int n)
    {
        int b = a[0];

        for (int x = 0; x < n; x++)
        {
            if (a[x] > b)
                b = a[x];
        }

        return b;
    }
}


