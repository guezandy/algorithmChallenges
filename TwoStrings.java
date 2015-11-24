/*
Problem Statement

You are given two strings, A and B. Find if there is a substring that appears in both A and B.

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer T, the number of test cases.

Then there will be T descriptions of the test cases. Each description contains two lines. The first line contains the string A and the second line contains the string B.

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.
1<=T<=10
1<=|A|,|B|<=105
Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
Explanation

For the 1st test case, the letter o is common between both strings, hence the answer YES. (Furthermore, the letter l is also common, but you only need to find one common substring.) 
For the 2nd test case, hi and world do not have a common substring, hence the answer NO.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static Boolean containsSubString(String i1, String i2) {
        int[] letters = new int[26];
        Arrays.fill(letters,0);
        for(int i = 0; i < i1.length(); i++) {
            if(letters[i1.charAt(i)-'a'] <=0) {
                letters[i1.charAt(i)-'a']++;
            }
        } 
        for(int j = 0; j < i2.length(); j++) {
            if(letters[i2.charAt(j)-'a'] > 0) {
                return true;
            }
        } 
        //System.out.println(); 
        return false;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T>0) {
            String input1 = scanner.next();
            String input2 = scanner.next();
            System.out.println((containsSubString(input1, input2) ? "YES" : "NO"));
            T--;
        }
    }
}
