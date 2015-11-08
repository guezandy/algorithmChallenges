

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int N, input;
    //cout << "ENter a number: ";
    cin >> N;
    int matrix[N][N];
    int inner = 0;
    int outter = 0;

    //inputting
    while (outter < N)  {
      cin >> input;
      if (cin.fail()) {
        break;
      }
      matrix[outter][inner] = input;
      inner++;  
      if(inner%N == 0) {
          outter++;
          inner = 0;
      }
    } 
    //print results of input
    /*for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            cout<<matrix[i][j]<<" ";
        }
        cout<<"\n";
    }*/

    //get first diagonal
    int first = 0;
    for(int i = 0; i < N; i++) {
    	first = first + matrix[i][i];
    }
    //get second diagonal
    int second = 0;
    for(int i = (N-1); i >= 0; i--) {
    	second = second + matrix[N-1-i][i];
    }
    //return solution
    cout<<abs(first - second)<<endl;
    return 0;
}
