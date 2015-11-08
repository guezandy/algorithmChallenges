#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int N, input;
    cin >> N;

    int count = 0;
    double positive = 0.0;
    double negative = 0.0;
    double zero = 0.0;
    //inputting
    while (count < N)  {
      cin >> input;
      if (cin.fail()) {
        break;
      }
      if(input > 0) {
        positive++;
      } else if(input < 0) {
        negative++;
      } else {
        zero++;
      }
      count++;
    } 
    cout<<(double)(positive/N)<<endl;
    cout<<(double)(negative/N)<<endl;
    cout<<(double)(zero/N)<<endl;
}
