/*
Instructor: Raheem Abolfathzadeh
Assignment Name: PA 303.7.1 - Practice Assignment - Array
Author: Pavlenko Anna
Date: 3/22/2024
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        /*
        Task 1: Write a program that creates an array of integers with a length of 3.
        Assign the values 1, 2, and 3 to the indexes. Print out each array element.
         */
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("The values of Array at index 0: " + array[0]);
        System.out.println("The values of Array at index 1: " + array[1]);
        System.out.println("The values of Array at index 2: " + array[2]);

        System.out.println("The array's values: " + Arrays.toString(array));


        System.out.println();

        System.out.println("Task 2: ");
        /*
        Task 2: Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2}
        and produce the following output: 7
         */
        int[] array1 = {13, 5, 7, 68, 2};
        System.out.println("The original Array: " + Arrays.toString(array1));
        System.out.println("The middle element in an array: " + array1[array1.length/2]);

        System.out.println();


        System.out.println("Task 3: ");
        /*
        Task 3: Write a program that creates an array of String type and
        initializes it with the strings “red,” “green,” “blue,” and “yellow.”
        Print out the array length. Make a copy using the clone( ) method.
        Use the Arrays.toString( ) method on the new array to verify that
        the original array was copied.
         */
        String[] array3 = {"red", "green", "blue", "yellow"};
        System.out.println("The length of the Array array: " + array3.length);

        String[] arrayCopy = array3.clone();
        System.out.println("The original Array array:" + Arrays.toString(array3));
        System.out.println("The copy of the Original Array:" + Arrays.toString(arrayCopy));

        System.out.println();

        System.out.println("Task 4: ");
        /*
        Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.  Print out the value at the first index and the last
        index using length - 1 as the index. Now try printing the value at index = length
        (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
        Now try to assign a value to the array index 5. You should get the same type of exception.
         */
        int[] array4 = {25, 78, 2, 7, 97};
        System.out.println("The value of 1st index in array: " + array4[array4.length - 5]);
        System.out.println("The value of last index in array: " + array4[array4.length - 1]);

        // Errors exceptions:
//        System.out.println("The value at index = length: " + array4[array4.length]);
//        System.out.println("The value at index = 5: " + array4[5]);


        System.out.println();

        System.out.println("Task 5: ");
        /*
        Task 5: Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i)
        to the corresponding index in the array.
         */
        int[] array5 = {5, 7, 8, 12, 44};

        for (int i = 0; i < array5.length ; i++) {
            System.out.println("The index [" + i + "]: " + i);
            System.out.println("The value of the element at index [" + i + "]: " + array5[i]);
        }

        System.out.println();

        System.out.println("Task 6: ");
        /*
        Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied
        by 2 to the corresponding index in the array.
         */
        int[] array6 = {5, 7, 8, 12, 44};

        for (int i = 0; i < array6.length ; i++) {
            System.out.println("The loop control variable i*2 to the corresponding index in the array: " + i * 2);
            System.out.println("The value of the loop at index [" + i + "]: " + array5[i] * 2);
        }

        System.out.println();

        System.out.println("Task 7: ");
        /*
        Task 7: Write a program where you create an array of 5 elements. Loop through the array
        and print the value of each element, except for the middle (index 2) element.
         */
        int[] array7 = {5, 7, 8, 12, 44};

        for (int i = 0; i < array6.length ; i++) {
            if(array7[i] != array7[array7.length/2]){
                System.out.println("The value of the loop at index [" + i + "]: " + array5[i]);
            }
        }

        System.out.println();

        System.out.println("Task 8: ");
        /*
        Task 8: Write a program that creates a String array of 5 elements and swaps the first
        element with the middle element without creating a new array.
         */

        String[] array8 = {"first", "second", "third", "fourth", "fifth"};
        System.out.println("The original Array: " + Arrays.toString(array8));

        array8[0] = array8[array8.length/2];

        System.out.println("The Array after swaps the first\n" +
                "        element with the middle element: " + Arrays.toString(array8));
        System.out.println();

        System.out.println("Task 9: ");
        /*
        Task 9:
            Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
            Print the array in ascending order, and print the smallest and the largest element of the array.
            The output will look like the following:
                        Array in ascending order: 0, 1, 2, 4, 9, 13
                        The smallest number is 0
                        The biggest number is 13
         */
        int[] array9 = {4, 2, 9, 13, 1, 0};
        System.out.println("The original Array: " + Arrays.toString(array9));
        Arrays.sort(array9);
        System.out.println("Array in ascending order: " + Arrays.toString(array9));
        System.out.println("The smallest number is " + array9[0]);
        System.out.println("The biggest number is " + array9[array9.length - 1]);
        System.out.println();


        System.out.println();

        System.out.println("Task 10: ");
        /*
        Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
         */
        Object[] mixed = new Object[5];
        mixed[0] = " Hi! ";
        mixed[1] = " today's Tempeture = ";
        mixed[2] = Integer.valueOf(42);
        mixed[3] = " tomorrow will be ";
        mixed[4] = Double.valueOf(-15.67);

        System.out.println("The array that includes an integer, 3 strings, and 1 double: " + Arrays.toString(mixed));

        System.out.println();

        System.out.println("Task 11: ");
        /*
        Task 11: Write some Java code that asks the user how many favorite things they have.
        Based on their answer, you should create a String array of the correct size.
        Then ask the user to enter the things and store them in the array you created.
        Finally, print out the contents of the array.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things you have? ");
        System.out.println("Please, enter the number of your favorite things: ");
        int num = scan.nextInt();

        // Creating the String Array of size == favorite things:
        String[] arr = new String[num];
        int i;

        System.out.print("Enter " + num + " Elements to Insert: ");
        for(i = 0; i < num; i++)
            arr[i] = scan.next();

        System.out.println("\nNow the new array is: ");
//        System.out.println();
        for(i = 0; i < num; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();

        System.out.println("The total Array of your Favorite Things are:  " + Arrays.toString(arr));


    }
}