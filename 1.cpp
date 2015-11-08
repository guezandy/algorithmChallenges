#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int findLowest(int s[]) {
    int lowest = s[0];
    for(int i = 0; i < sizeOf(s); i++) {
        if(s[i] < lowest) {
            lowest = s[i];
        }
    }
    return lowest;
}

int findHighest(int s[]) {
    int highest = s[0];
    for(int i = 0; i < sizeOf(s); i++) {
        if(s[i] > highest) {
            highest = s[i];
        }
    }
    return highest;
}

int main() {
    int T;
    cin>>T;
    int s[T];
    for(int i = 0; i < T; i++) {
        cin>>s[i];
    }
    while(findHighest(s) > 1) {
        for(int i = 0; i < T; i++) {
            cout<<"TEST";
        }
    }

    return 0;
}
