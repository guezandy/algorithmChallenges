/*
Problem Statement

John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a gem-element if it occurs at least once in each of the rocks.

Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of an integer, N, the number of rocks. 
Each of the next N lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.

Constraints 
1≤N≤100 
Each composition consists of only lower-case Latin letters ('a'-'z'). 
1≤ length of each composition ≤100
Output Format

Print the number of gem-elements that are common in these rocks. If there are none, print 0.

Sample Input

3
abcdde
baccd
eeabg
Sample Output

2
Explanation

Only "a" and "b" are the two kinds of gem-elements, since these are the only characters that occur in every rock's composition.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        Boolean[][] rocksLetters = new Boolean[index][26];
        for(int i = 0; i < index; i++) {
            Arrays.fill(rocksLetters[i], false);
        }
        //get input strings and update arrays
        int T = index;
        while(T>0) {
            String test = scanner.next();
            for(int i = 0; i < test.length(); i++) {
                //System.out.print("Setting: "+ (T-1) + " char: "+test.charAt(i)+" ascii: "+ (test.charAt(i) - 97));
                rocksLetters[T-1][test.charAt(i)-97] = true;
                //System.out.println(" array value: ["+(T-1)+"]["+(test.charAt(i)-97)+"]: "+ rocksLetters[T-1][test.charAt(i)-97]);
            }
            T--;
        }

        for(int i = 0; i < index; i++) {
            for(int j = 0; j < 26; j++) {
                //System.out.print(rocksLetters[i][j]);
            }
            //System.out.println();
        }


        int gemElementCount = 0;
        Boolean gemElement;
        for(int i = 0; i < 26; i++) {
            //each 26 letters
            gemElement = true;
            for(int j = 0; j < index; j++) {
                //check if each rock has that letter
                //System.out.print(rocksLetters[j][i] + " ");
                if(rocksLetters[j][i] == false) {
                    gemElement = false;
                } else {
                    //ignore 
                }
            }
            //System.out.println();
            if(gemElement) {
                gemElementCount++;
            }
        }
        System.out.println(gemElementCount);
    }
}

