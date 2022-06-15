package ArrayLecture;

public class ArrayDeclare {
    /*
}
    public static void main(String[] args) {

        /*
        // Single Dimensional Arrays
        int[] arrayOfInts;  //creates a one dimensional array
        // Rectangular Arrays
        int[][] my2DArray = new int[4][4];                 //creates a 2 dimensional array that will hold (4 X 4) 16 elements.
        int[][][] my3DArray = new int[5][5][5];            //creates a 3 dimensional array that will hold (5 X 5 X 5) 125 elements.
        String[][] myJaggedStringArray = new String[2][4];//creates a jagged 2 dimensional array that will hold (2 X 4) 8 elements.

        // Jagged Arrays
        String[][] strArray = {{"This", "is"}, {"a", "test", "of", "jagged arrays"}};

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.print(strArray[i][j] + " ");
            }
            System.out.println();
        }

        // ##Initializing a Single Dimensional Array
        // create a new array with 4 elements (default 0 for int)
        int[] numbers = new int[4];

        // same array, specifying element values
        int[] numbers2 = {0, 0, 0, 0};

        //same array, using a slightly older (and more verbose) syntax
//NOTE: this is outdated, but you may see code like this in the wild
        int[] numbers3 = new int[] {0, 0, 0, 0}


        // ## Initializing a Rectangular Array

        int rows = 2;
        int columns = 3;
        int [][] table = new int[rows] [columns];
        // could also be written as new int [2][3]

        // two-dimensional array, but with values in each element
        //                          row 0        row 1
        int[][] autoInitTable = { {5, 3, 1 }, { 2, 4, 6 }}


        // array with 3 elements that are each an array
        // another jagged array example
        int[][] jagged = new int[3][];

        jagged[0] = new int[] {1, 2};
        jagged[1] = new int[] {3, 4, 5, 6};
        jagged[2] = new int[] {7, 8, 9};

        // Here is how we could print the element currently
        // int[] numbers = new int[] { 3, 5, 8, 9 };
        // indexes                  0  1  2  3

        // System.out.println(numbers[2]);

        // numbers[3] = 7; // replace 9 with 7 in the fourth element
        // System.out.println(numbers[3]);
        int[][] autoTable = { { 5, 3, 1 }, { 2, 4, 6 } };
        // 1st row, 2nd column
        int three = autoTable[0][1];

        // 2nd row, 3rd column
        int six = autoTable[1][2];

        // jagged array
        // get 8 from 3rd array, 2nd element
        int eight = jagged[2][1];

        // replace 2 with 42
        // 1st array, 2nd element
        jagged[0][1]=42;


        // ## Iterating through Arrays
        // Sum the Elements of an Array
        int[] numbers = {3, 5, 2, 1};
        int sum = 0; // keep running total
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("i = " + i + " current sum = " + sum);
        }
        System.out.println("Final sum: " + sum);


        // Looping Back to Front, With a Twist
        int[] numbers = {3, 5, 2, 0};
        // start at last index, go to first (0)
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.println("index " + i + " - " + numbers[i]);
            }
        }


        // Printing Pairs of Elements
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length - 2; i += 3) {
            System.out.println("Pair: (" + numbers[i] + ", " + numbers[i + 1] + ")");
        }



        //## Dealing with Errors
        int[] numbers = {1, 2, 3, 4, 5, 6}

        // index out of range exception, there are only 6 elements so the max index is 5
        System.out.println(numbers[52]);
    }
    // ## change the size of Array
    public int[] GrowArray(int[] original, int howManyMoreElements){
        int[] newArray = new int[original.length + howManyMoreElements];

        for (int i = 0; i < original.length; i++) {
            // copy the element at the current index
            // from original to newArray
            newArray[i] = original[i];
        }
        return newArray;
    }

         */
}
