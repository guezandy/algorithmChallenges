/*Problem Statement

Julius Caesar protected his confidential information from his enemies by encrypting it. Caesar rotated every letter in the string by a fixed number K. This made the string unreadable by the enemy. You are given a string S and the number K. Encrypt the string and print the encrypted string.

For example: 
If the string is middle-Outz and K=2, the encoded string is okffng-Qwvb. Note that only the letters are encrypted while symbols like - are untouched. 
'm' becomes 'o' when letters are rotated twice, 
'i' becomes 'k', 
'-' remains the same because only letters are encoded, 
'z' becomes 'b' when rotated twice.

Input Format

Input consists of an integer N equal to the length of the string, followed by the string S and an integer K.

Constraints 
1≤N≤100 
0≤K≤100 
S is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.

Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb
Explanation

As explained in statement.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeasarCipher {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);

    	int N = s.nextInt();
    	String S = s.next(); //next line crashes for some reason
    	int K = s.nextInt();

    	//System.out.println("N: "+N+" S:" +S+" K:"+K);

    	for(int i = 0; i < N; i++) {
    		int l = S.charAt(i);
    		//letter is lowercase of uppercase
    		if(l >= 65 && l <= 90) {
    			l = l+K;
    			if(l > 90) {
    				l = (l%90)+64;
    			}
    		} else if(l >= 97 && l <= 122) {
    			l = l+K;
    			if(l > 122) {
    				l = (l%122) + 96;
    			}
    		}

    		System.out.print((char)l);
    		//System.out.println((char)(S.charAt(i)+1));// = (S.charAt(i) - K);
    	}

    	//System.out.println("Cipher: "+S);
    }
}