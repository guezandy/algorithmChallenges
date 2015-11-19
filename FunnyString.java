/*
Problem Statement

Suppose you have a string S which has length N and is indexed from 0 to N−1. String R is the reverse of the string S. The string S is funny if the condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1 to N−1.

(Note: Given a string str, stri denotes the ascii value of the ith character (0-indexed) of str. |x| denotes the absolute value of an integer x)

Input Format

First line of the input will contain an integer T. T testcases follow. Each of the next T lines contains one string S.

Constraints

1<=T<=10
2<=length of S<=10000
Output Format

For each string, print Funny or Not Funny in separate lines.

Sample Input

2
acxz
bcxz
Sample Output

Funny
Not Funny
Explanation

Consider the 1st testcase acxz

here

|c-a| = |x-z| = 2
|x-c| = |c-x| = 21
|z-x| = |a-c| = 2
Hence Funny.

Consider the 2nd testcase bcxz

here

|c-b| != |x-z|
Hence Not Funny.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T > 0) {
            String line = scanner.next();
            int start = 0;
            int end = line.length()-1;
            boolean funny = true;
            while(start < line.length()-1) {
                //System.out.print("Compare: "+(start+1)+" : "+line.charAt(start+1));
                //System.out.print(" and: "+(start)+" : "+line.charAt(start));
                //System.out.print(" equals: "+Math.abs((line.charAt(start+1) - line.charAt(start))));
                //System.out.print(" with: "+(end-1)+ " : "+line.charAt(end-1));
                //System.out.print(" and: "+ end + " : "+ line.charAt(end));
                //System.out.println(" equals: "+Math.abs((line.charAt(end-1) - line.charAt(end))));
                if(Math.abs((line.charAt(start+1) - line.charAt(start))) != Math.abs((line.charAt(end-1) - line.charAt(end)))) {
                    funny = false;
                }
                start++;
                end--;
            }
            System.out.println((funny) ? "Funny" : "Not Funny");
            T--;
        }
    }
}

















