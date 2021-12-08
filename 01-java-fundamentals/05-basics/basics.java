import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class basics {
    public static void main(String[] args) {
        // // Print all numbers between 1 - 255
        // for (int i = 1; i < 256; i++) {
        //     System.out.println(i);
        // }


        // // Print odd numbers between 1 - 255
        // for (int i = 1; i < 256; i++) {
        //     if (i % 2 == 1) {
        //         System.out.println(i);
        //     }
        // }


        // // Sigma of 255 AKA Sum to 255
        // int sum = 0;
        // for (int i = 1; i < 256; i++) {
        //     sum = i + sum;
        // }
        // System.out.println(sum);


        // // Iterating through an array
        // int [] arr = new int [] {1, 3, 5, 7, 9, 13};
        // for (int i : arr) {
        //     System.out.println(i);
        // }


        // // Find max
        // ArrayList<Integer> aList = new ArrayList<>();
        // aList.add(8);
        // aList.add(-9);
        // aList.add(3);
        // aList.add(7);
        // aList.add(-2);
        // aList.add(1);
        // Integer max = Collections.max(aList);
        // System.out.println(max);


        // // Array with Odd Numbers
        // ArrayList<Integer> y = new ArrayList<>();
        // for (int i = 1; i < 256; i++) {
        //     if (i % 2 == 1) {
        //         y.add(i);
        //     }
        // }
        // for (int j : y) {
        //     System.out.println(j);
        // }


        // // Get Average
        // ArrayList<Integer> aList = new ArrayList<>();
        // aList.add(2);
        // aList.add(6);
        // aList.add(4);
        // aList.add(12);
        // int sum = 0;
        // for (int i : aList) {
        //     sum += i;
        // }
        // int avg = sum / aList.size();
        // System.out.println(avg);


        // // Greater Than Y
        // int []arr = new int [] {1, 3, 5, 7, 9, 13};
        // int y = 4;
        // int count = 0;
        // for (int i : arr) {
        //     if (i > y) {
        //         count++;
        //     }
        // }
        // System.out.println(count);


        // // Square the values
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(3);
        // arr.add(5);
        // ArrayList<Integer> x = new ArrayList<>();
        // for (int i : arr) {
        //     int j = i * i;
        //     x.add(j);
        // }
        // arr = x;
        // System.out.println(x);


        // // // Eliminate Negative Numbers
        // int []arr = new int [] {1, -3, -5, 7, -9, 13};

        // for (int j : arr) {
        //     System.out.println(j);
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < 0) {
        //         arr[i] = 0;
        //     }
        //     System.out.println(arr[i]);
        // }


        // // Max Min Avg
        // ArrayList<Integer> aList = new ArrayList<>();
        // aList.add(8);
        // aList.add(9);
        // aList.add(4);
        // int max = Collections.max(aList);
        // int min = Collections.min(aList);

        // int sum = 0;
        // for (int i : aList) {
        //     sum += i;
        // }

        // int avg = sum / aList.size();
        // aList.clear();
        // aList.add(max);
        // aList.add(min);
        // aList.add(avg);

        // for (int j : aList) {
        //     System.out.println(j);
        // }


        // Shifting the Values in the Array
        // int []aList = new int [] {1, -3, -5, 7, -9, 13};

        // // Move one down
        // for (int i = 0; i < aList.length-1; i++) {
        //     aList[i] = aList[i+1];
        // }

        // Move one up
        // for (int i = aList.length - 1; i > 0; i--) {
        //     aList[i] = aList[i-1];
        // }


        // for (int i : aList) {
        //     System.out.println(i);
        // }        

    }
}
