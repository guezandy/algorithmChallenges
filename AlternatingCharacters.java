/*Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer T, i.e. the number of test cases. 
The next T lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.

Constraints

1≤T≤10 
1≤ length of string ≤105
Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Sample Output

3
4
0
0
4
Explanation

AAAA ⟹ A, 3 deletions
BBBBB ⟹ B, 4 deletions
ABABABAB ⟹ ABABABAB, 0 deletions
BABABA ⟹ BABABA, 0 deletions
AAABBB ⟹ AB, 4 deletions because to convert it to AB we need to delete 2 A's and 2 B's

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
        while(T>0) {
            String test = scanner.next();
            Boolean A = (test.charAt(0) == 'A' ? true : false);
            int traverse = 1;
            int delete = 0;
            while(traverse < test.length()) {
                System.out.println("A is: "+A +" and charAt "+traverse+" is "+test.charAt(traverse));

                if(A && test.charAt(traverse) == 'A') { //bad
                    System.out.println("A & A");
                    delete++;
                } else if(A && test.charAt(traverse) == 'B') { //good
                    System.out.println("A & B");                    
                    A = !A;
                } else if(!A && test.charAt(traverse) == 'B'){ //bad
                    System.out.println("B & B");
                    delete++;
                } else if(!A && test.charAt(traverse) == 'A') { //good
                    System.out.println("B  & A");                    
                    A = !A;
                } else {
                    System.out.println("SLIPPING!");
                }
                traverse++;
            }
            System.out.println(delete);
            T--;
        }
    }
}

