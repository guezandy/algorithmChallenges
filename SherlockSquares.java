import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	System.out.println("Hello");
    	Scanner scan = new Scanner(System.in);
    	int N, A, B;
    	N = scan.nextInt();
    	for(int i = 0; i < N; i++) {
    		int count = 0;
    		A = scan.nextInt();
    		B = scan.nextInt();
    		while(A <= B) {
    			double dsqrt = Math.sqrt(A);
    			int isqrt = (int) dsqrt;
    			if (dsqrt == isqrt) {
    				count++;
    			}
    			A++;
    		}
    		System.out.println(count);
    	}

    }
}