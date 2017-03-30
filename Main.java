public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        array1[0] = 68;
        array1[1] = 76;
        array1[2] = 31;
        array1[3] = 99;
        array1[4] = 61;
        array1[5] = 21;
        array1[6] = 79;
        array1[7] = 20;
        array1[8] = 43;
        array1[9] = 4;
/*
        int n = 100;
        int D = 999999;
        int iterations = 100000;

        long start = System.currentTimeMillis();

        for (int y = 0; y < iterations; y++) {

            int[] array1 = new int[n];

            for (int x = 0; x < n; x++) {
                int random = (int) (Math.random() * D + 1);
                array1[x] = random;
            }

            //System.out.println(Arrays.toString(array1));
*/
            MergeSort myClass = new MergeSort();
            myClass.mergeSort(array1);

            //Arrays.sort(array1);

            //System.out.println(Arrays.toString(array1));
        }
/*
        long end = System.currentTimeMillis();
        end = (end - start);

        System.out.printf("Your merge sort took: %d milliseconds%n", end);

        //Radix Sort !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        start = System.currentTimeMillis();

        for (int y = 0; y < iterations; y++) {

            int[] array1 = new int[n];

            for (int x = 0; x < n; x++) {
                int random = (int) (Math.random() * D + 1);
                array1[x] = random;
            }

            RadixSort myRadix = new RadixSort();
            myRadix.radixSort(array1, n);

            //System.out.println(Arrays.toString(array1));
        }

        end = System.currentTimeMillis();
        end = (end - start);

        System.out.printf("Your radix sort took: %d milliseconds%n", end);
    }

    */
}
