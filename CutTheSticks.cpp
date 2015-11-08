/*
Problem Statement

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:

5 4 4 2 2 8
Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:

3 2 2 6
The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format 
The first line contains a single integer N. 
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format 
For each operation, print the number of sticks that are cut, on separate lines.

Constraints 
1 ≤ N ≤ 1000 
1 ≤ ai ≤ 1000

Sample Input #00

6
5 4 4 2 2 8
Sample Output #00

6
4
2
1
Sample Input #01

8
1 2 3 4 3 3 2 1
Sample Output #01

8
6
4
1
Explanation

Sample Case #00 :

sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE
Sample Case #01

sticks-length         length-of-cut   sticks-cut
1 2 3 4 3 3 2 1         1               8
_ 1 2 3 2 2 1 _         1               6
_ _ 1 2 1 1 _ _         1               4
_ _ _ 1 _ _ _ _         1               1
_ _ _ _ _ _ _ _       DONE            DONE
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	//1 value all the rest are 0
	//the only values in the arr are equal
	public static boolean areWeDone(int[] arr) {
		int count = 0;
		boolean different = false;
		int temp = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 1) {
				if(temp < 0) {
					temp = arr[i];
					//System.out.println("TEMP: "+temp);
				} else if(arr[i] != temp) {
					//System.out.println("Diff: "+temp+" and "+arr[i]);
					different = true;
				}
				count++;
			}
		}
		if(count > 1 && different) {
			return false;
		} else {
			return true;
		}
	}

	public static int findLowest(int[] arr) {
		int lowest = 99999999;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i] < lowest) {
				lowest = arr[i];
			}
		}
		return lowest;
	}

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int N, A, B;
    	N = scan.nextInt();
    	int[] arr = new int[N];
    	for(int i = 0; i < N; i++) {
    		arr[i] = scan.nextInt();
    	}
    	//System.out.println(areWeDone(arr));
    	//System.out.println(findLowest(arr));
    	while(!areWeDone(arr)) {
	    	int low = findLowest(arr);
	    	int cutCount = 0;
		    for(int i = 0; i < arr.length; i++) {
				if(arr[i] > 0) {
	    			arr[i] = arr[i] - low;
	    			cutCount++;
	    			//System.out.print(arr[i]+" ");
				}
			}
			System.out.println(cutCount);
		} System.out.println("1");
    }
}