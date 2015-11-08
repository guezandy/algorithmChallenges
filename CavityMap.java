/*Problem Statement

You are given a square map of size n×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, n, denoting the size of the map. Each of the following n lines contains n positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 
1≤n≤100
Output Format

Output n lines, denoting the resulting map. Each cavity should be replaced with character X.

Sample Input

4
1112
1912
1892
1234
Sample Output

1112
1X12
18X2
1234*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {
	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int[][] field = new int[N][N];

		for(int i = 0; i < N; i++) {
			int input = s.nextInt();
			int col = N-1;
			while(col >= 0) {
				field[i][col] = input%10;
				input = input/10;
				//System.out.println("INPUTTED: "+field[i][col]);
				col--;
			}
		}
		for(int j = 0; j < N; j++) {
			for(int k = 0; k < N; k++) {
				if(j == 0 || k == 0 || j == (N-1) || k == (N-1)) {
					System.out.print(field[j][k]);
				} else if((field[j-1][k] < field[j][k]) &&
					(field[j+1][k] < field[j][k]) &&
					(field[j][k-1] < field[j][k]) &&
					(field[j][k+1] < field[j][k])) {
						//all surroundings are greater than the location
						//field[j][k] = -1;
						System.out.print("X");
				} else {
					System.out.print(field[j][k]);
				}
			}
			System.out.println();
		}
		/*
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		*/
	}
}