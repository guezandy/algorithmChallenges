/*
Problem Statement

Русский \| 中文
Watson gives Sherlock an array A of length N. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 
Formally, find an i, such that, A1+A2...Ai-1 =Ai+1+Ai+2...AN.

Input Format 
The first line contains T, the number of test cases. For each test case, the first line contains N, the number of elements in the array A. The second line for each test case contains N space-separated integers, denoting the array A.

Output Format 
For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

Constraints 
1≤T≤10 
1≤N≤105 
1≤Ai ≤2×104 
1≤i≤N
Sample Input

2
3
1 2 3
4
1 2 3 3
Sample Output

NO
YES
Explanation 
For the first test case, no such index exists. 
For the second test case, A[1]+A[2]=A[4], therefore index 3 satisfies the given conditions.
*/
import java.util.*;
public class Solution {


    public static Boolean solve(int[] input) {
        for(int i = 1; i < input.length-1; i++) {
            int less = 0;
            int greater = 0;
            int traverse = 0;
            while(traverse < i) {
                less+=input[traverse++];
            }
            traverse = i + 1;
            while(traverse < input.length) {
                greater+=input[traverse++];
            }
            if(less == greater) {
                return true;
            }
        }
        return false;
    }

    public static Boolean solve2(int[] input) {
        int[] sum = new int[input.length];
        sum[0] = input[0];
        for(int i = 1; i < input.length; i++) {
            sum[i] = sum[i-1] + input[i];
            //System.out.print(sum[i]+ " ");
        }
        for(int i = 1; i < input.length-1; i++) {
            if(sum[i-1] == (sum[input.length-1]-sum[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T>0) {
            int N = scanner.nextInt();
            int[] input = new int[N];
            for(int i = 0; i < N; i++) {
                input[i] = scanner.nextInt();
            }
            System.out.println(solve2(input) ? "YES" : "NO");
            T--;
        }

    }    
}
