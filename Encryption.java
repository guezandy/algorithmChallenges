/*
Problem Statement

An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let L be the length of this text. 
Then, characters are written into a grid, whose rows and columns have the following constraints:

⌊L‾‾√⌋≤rows≤column≤⌈L‾‾√⌉, where ⌊x⌋ is floor function and ⌈x⌉ is ceil function
For example, the sentence if man was meant to stay on the ground god would have given us roots after removing spaces is 54 characters long, so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots
Ensure that rows×columns≥L
If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows×columns.
The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message in English with no spaces between the words. The maximum message length can be 81 characters. Print the encoded message.

Here are some more examples:

Sample Input:

haveaniceday
Sample Output:

hae and via ecy
Sample Input:

feedthedog    
Sample Output:

fto ehg ee dd
Sample Input:

chillout
Sample Output:

clu hlt io
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //remove spaces
        String text = input.replaceAll("\\s+", "");
        double sqr = Math.sqrt(text.length());
        double floor = Math.floor(Math.sqrt(text.length()));
        double ciel = Math.ceil(Math.sqrt(text.length()));
        System.out.println("len: "+text.length());
        System.out.println("SQR: "+sqr);
        System.out.println("Flor: "+floor);
        System.out.println("Ceil: "+ciel);

        char[][] arr = new char[(int)floor][(int)ciel];
        for(int i = 0; i < (int)floor; i++) {
            for(int j = 0; j < (int)ciel; j++) {
                //char at i*ciel + j
                if((i*ciel+j) >= text.length()) {
                    break;
                }
                System.out.print(text.charAt(i*(int)ciel + j) + " ");
                arr[i][j] = text.charAt(i*(int)ciel + j); 
            }
            System.out.println();
        }
        System.out.println("SOLUTION: ");
        for(int j = 0; j <= (int) ciel; j++) {
            for(int i = 0; i < (int) floor; i++) {
                System.out.print(arr[i][j]);
            }
            String s = (j == (ciel-1) ? "" : " ");
            System.out.print(s);
        }
    }
}

