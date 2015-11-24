/*
Problem Statement

Sorting is often useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses, as well.

Challenge 
Given a list of unsorted integers, A={a1,a2,…,aN}, can you find the pair of elements that have the smallest absolute difference between them? If there are multiple pairs, find them all.

Input Format 
The first line of input contains a single integer, N, representing the length of array A. 
In the second line, there are N space-separated integers, a1,a2,…,aN, representing the elements of array A.

Output Format 
Output the pairs of elements with the smallest difference. If there are multiple pairs, output all of them in ascending order, all on the same line (consecutively) with just a single space between each pair of numbers. If there's a number which lies in two pair, print it two times (see the sample case #3 for explanation).

Constraints

2≤N≤200000
−107≤ai≤107
ai≠aj,where 1≤i<j≤N
Sample Input #1

10
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 
Sample Output #1

-20 30
Explanation 
(30) - (-20) = 50, which is the smallest difference.

Sample Input #2

12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 
Sample Output #2

-520 -470 -20 30
Explanation 
(-470) - (-520) = 30 - (-20) = 50, which is the smallest difference.

Sample Input #3

4
5 4 3 2
Sample Output #3

2 3 3 4 4 5
Explanation 
Here, the minimum difference will be 1. So valid pairs are (2, 3), (3, 4), and (4, 5). So we have to print 2 once, 3 and 4 twice each, and 5 once.
*/


import java.util.*;
public class Solution {

    public static void quicksort(int[] arr, int low, int high) {
        if(arr == null || arr.length == 0) {
            return;
        }

        if(low >= high) {
            return;
        }

        int middle = low + (high-low)/2;
        int pivot = arr[middle];
        int i = low;
        int j = high;

        while(i <= j) {
            while(arr[i] < pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            if(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(low < j) {
            quicksort(arr, low, j);
        }
        if(high > i) {
            quicksort(arr, i, high);
        }
        
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] input = new int[T];
        for(int i = 0; i < T; i++) {
            input[i] = scanner.nextInt();
        }
        quicksort(input, 0, T-1);
        for(int i : input) {
           // System.out.print(i+" ");
        }
        //System.out.println();

        List<Integer> list = new ArrayList<Integer>();
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < T-1; i++) {
            int difference = input[i+1] - input[i];
            if(difference == smallest) {
                //System.out.println(smallest+" ADDING "+i+" to list");
                list.add(i);
            } else if(difference < smallest && difference > 0) {
                //System.out.println("Reset list: "+smallest+ " "+i);
                smallest = difference;
                list.clear();
                list.add(i);
            }
        }
        //System.out.println("SIZE: "+list.size());
        //System.out.println("SMALLEST: "+ smallest);
        
        for(int i : list) {
            System.out.print(input[i]+" "+input[i+1]+" ");
        }
    }    
}
