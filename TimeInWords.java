/*
Problem Statement

Given the time in numerals we may convert it into words, as shown below:

5:005:015:105:305:405:455:475:28→ five o' clock→ one minute past five→ ten minutes past five→ half past five→ twenty minutes to six→ quarter to six→ thirteen minutes to six→ twenty eight minutes past five
Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints
1≤H<12
0≤M<60
Output Format

Display the time in words.

Sample Input

5  
47  
Sample Output

thirteen minutes to six
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //do {
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        //} while((hour >= 0 && hour <=24) && (min >= 0 && min <= 60));

        if(min == 0){
            System.out.println(numToString(hour) + " o' clock");
        } else if(min > 0 && min < 15) {
            String s = (min == 1 ? "" : "s"); 
            System.out.println(numToString(min) + " minute" + s + " past "+ numToString(hour));
        } else if(min == 15) {
            System.out.println("quarter past "+numToString(hour));
        } else if(min > 15 && min < 29) {
            System.out.println(numToString(min) + " minutes past "+ numToString(hour));
        } else if(min == 30) {
            System.out.println("half past "+ numToString(hour));
        } else if(min > 30 && min < 45) {
            System.out.println(numToString(60-min) + " minutes to "+numToString(hour+1));
        } else if(min == 45) {
            System.out.println("quarter to "+ numToString(hour+1));
        } else if(min > 45 && min < 60) {
        	String s = ((60-min) == 1 ? "" : "s");
            System.out.println(numToString(60-min) + " minute"+s+" to "+numToString(hour+1));
        }
    }

    public static String numToString(int n) {
        switch(n) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6: 
                return "six";
            case 7: 
                return "seven";
            case 8: 
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19: 
                return "nineteen";
            case 20:
                return "twenty";
            case 21:
                return "twenty one";
            case 22:
                return "twenty two";
            case 23:
                return "twenty three";
            case 24:
                return "twenty four";
            case 25:
                return "twenty five";
            case 26:
                return "twenty six";
            case 27:
                return "twenty seven";
            case 28:
                return "twenty eight";
            case 29:
                return "twenty nine";
            default:
                return "void";
        }
    }
}

