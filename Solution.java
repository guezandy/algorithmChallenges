import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        int total = N/C; //from straight purchasing
        int additional = (int)(total/M); //additional from returning wrappers from the purchases
        //System.out.println("T: "+total+" A: "+additional);
        int temp = total;
        total = total + additional;
        while(((temp%C) + additional) >= M) { //find how many returned wrappers plus the remainder add up to a new candy
            additional = additional - 3;
            total++;
        }
        return total;         
    }    
}
