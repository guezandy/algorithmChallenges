import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int attempt1(int[] arr, int M) {
        int largestModulo = 0;
        for(int i = 1; i < arr.length+1; i++) {
            //System.out.println("ARRAY SIZE: "+i);
            int trav = 0;
            while(trav + i < arr.length) {
                //System.out.println("trav start: "+trav);
                int sum = 0;
                for(int j = 0; j <=i; j++) {
                    //System.out.println("SUb array: "+j);
                    sum = sum+arr[j];
                }
                if(sum%M > largestModulo) {
                    largestModulo = sum;                    
                    //System.out.println("NEW largest: "+largestModulo);
                } 
                trav++;
            }
        }
        return largestModulo;
    }

    public static int largestModulo = 0;
    public static int attempt2(int[] arr, int M, int start, int size) {
        System.out.println("Calling attemp: "+start+ " "+size);
        if(size == 1) {
            return arr[start]%M;
        }
        int sum = 0;
        for(int i = 0; (i+size) <= arr.length; i++) {
            return attempt2(arr, M, i, size--)%M;
        }
        if(sum%M > largestModulo) {
            largestModulo = sum%M;
        }
        return sum%M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T>0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(attempt2(arr,M,0, arr.length));
            T--;
        }
    }
}