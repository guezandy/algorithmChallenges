/*Problem Statement

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. You are given the height of the staircase. You need to print a staircase as shown in the example.

Input Format

You are given an integer N depicting the height of the staircase.

Constraints 
1≤N≤100
Output Format

Draw a staircase of height N in the format given below.

For example:

     #
    ##
   ###
  ####
 #####
######
Staircase of height 6. 
Note: The last line has 0 spaces before it.
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int N;
    cin >> N;
    for(int i = 1; i < N+1; i++) {
      //each row has N- i spaces
      for(int j = 0; j < (N-i); j++) {
        cout<<" ";
      }
      //each row has i hashtags
      for(int k = i; k > 0; k--) {
        cout<<"#";
      }
      cout<<endl;
    }
    return 0;
}
