// CSE 110     : <Spring 2021>
// Assignment  : <assignment #5>
// Author      : <Erik Christian Gotta> & <1222628953>
// Description : <10 methods to change and mess around with arrays>
import java.util.Arrays;
public class Assignment5 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
        int intArray[] = {1, 22, 333, 400, 5005, 0};
        // int freshArray[] = {33, 13, 18, 37};
        // int sortedArray[] = {1, 2, 3, 4};
        // int nonSortedArray[] = {3, 2, 7, 9};
        // String sep = "-";

        //1
        System.out.println("METHOD 1");
        printArray(intArray, "-");
        System.out.println();
        //2
        System.out.println("METHOD 2");
        System.out.println(getFirst(intArray));
        //3
        System.out.println("METHOD 3");
        System.out.println(getLast(intArray));
        //4
        System.out.println("METHOD 4");
        getAllButFirst(intArray);
        //5
        System.out.println();
        System.out.println("METHOD 5");
        System.out.println(getIndexOfMin(intArray));
        //6
        System.out.println("METHOD 6");
        System.out.println(getIndexOfMax(intArray));
        //7
        System.out.println("METHOD 7");
        swapByIndex(intArray, 0, 5);
        //8
        System.out.println();
        System.out.println("METHOD 8");
        removeAtIndex(intArray, 1);
        //9
        System.out.println();
        System.out.println("METHOD 9");
        insertAtIndex(intArray, 1, 12);
        //10
        System.out.println();
        System.out.println("METHOD 10");
        isSorted(intArray);
    }
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.

    public static int[] printArray(int intArray[], String string) {

        for (int i = 0; i < intArray.length; i++) {
            if (i > 0) {
                System.out.print(string);
            }
            System.out.print(intArray[i]);
        }

        return intArray;
        
    }
    
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.

    public static int getFirst(int intArray[]) {
        int answer = intArray[0];
        return answer;
    }
    
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.

    public static int getLast(int intArray[]) {
        int last = intArray.length - 1;
        int answer = intArray[last];
        return answer;
    }
    
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.

    public static int[] getAllButFirst(int intArray[]) {

        int[] copy = new int[intArray.length -1];

        for (int i = 0, j = 0; i < intArray.length; i++) {
            if (i != 0) {
                copy[j++] = intArray[i];
            }
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + ", ");
            
        }   
        return copy;
    }
    
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.

    public static int getIndexOfMin(int[] intArray) {
        int i, min, minIndex;
        int n = intArray.length;
        min = intArray[0];
        minIndex = 0;

        for (i = 1; i < n; i++) {
            if (min >= intArray[i]) {
                min = intArray[i];
                minIndex = i;
            }
        }

        return minIndex;

    }
    
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.

    public static int getIndexOfMax(int[] arr) {
        int i, max, maxIndex;
        int n = arr.length;
        max = arr[0];
        maxIndex = 0;

        for (i = 1; i < n; i++) {
            if (max <= arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.

    public static int[] swapByIndex(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + ", ");
            
        } 
        return arr;
    }
    
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.

    public static int[] removeAtIndex(int[] arr, int index) {
       
        int[] copy = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                copy[j++] = arr[i];
            }
        }

        for (int x = 0; x < copy.length; x++) {
            System.out.print(copy[x] + ", ");
        }

        return copy;
    }
    
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.

    public static int[] insertAtIndex(int[] arr, int index, int value) {
        int[] copy = new int[arr.length + 1];

        for (int i=0, j=0; i < copy.length; i++) {
            if(i == index) {
               copy[i] = value;
            } else {
               copy[i] = arr[j++];
            }
         }
   
         for (int x = 0; x < copy.length; x++) {
            System.out.print(copy[x] + ", ");
        }

         return copy;
    }
    
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    
    public static boolean isSorted(int[] arr) {

        int[] copy = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < (copy.length - 1); i++) // Outer loop will control the number of passes
        {
            for(int j = 0; j < (copy.length - i -1); j++)// Inner loop will control the comparison of adjacent elements
            {
                if (copy[j]>copy[j+1])
                {
                    // Swap two elements
                    int temp = copy[j];
                    copy[j] = copy[j+1];
                    copy[j+1] = temp;
                }
            }
        }

        //too check arrays order
        // System.out.println("Sorted array:");
        // for (int i = 0; i < copy.length; i++)
        // {
        //     System.out.print(copy[i]+",");
        // }

        if (Arrays.equals(copy, arr)) {
            System.out.println("Array is in ascending order: True");
            return true;
        } else {
            System.out.println("Array is not in ascending order: False");
            return false;
        }

    }

}
