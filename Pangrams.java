/*
Problem Statement

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

Input Format Input consists of a line containing s.

Constraints 
Length of s can be at most 103 (1≤|s|≤103) and it may contain spaces, lower case and upper case letters. Lower case and upper case instances of a letter are considered the same.

Output Format Output a line containing pangram if s is a pangram, otherwise output not pangram.

Sample Input #1

We promptly judged antique ivory buckles for the next prize    
Sample Output #1

pangram
Sample Input #2

We promptly judged antique ivory buckles for the prize    
Sample Output #2

not pangram
Explanation 
In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] letters = new boolean[26];
        Arrays.fill(letters, false);
        String input = scanner.nextLine();
        String inputLower = input.toLowerCase();
        int uniqueLetters = 0;
        for(int i = 0; i < input.length(); i++) {
            if(inputLower.charAt(i) > 96 && inputLower.charAt(i) < 123) {
                if(letters[(inputLower.charAt(i)-97)] != true) {
                    letters[(inputLower.charAt(i)-97)] = true;
                    uniqueLetters++;
                }
            } else {
                //ignore the character cause its not a letter
            }
        }

        System.out.println((uniqueLetters == 26 ? "pangram" : "not pangram"));
        /*if(uniqueLetters == 26) {
            System.out.println("Panagram");
        } else {
            System.out.println("Not Panagram only "+ uniqueLetters+ " unique letters");
        }*/
    }
}

