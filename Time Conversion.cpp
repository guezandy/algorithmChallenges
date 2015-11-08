/*Problem Statement

4.44/10

You are given time in AM/PM format. Convert this into a 24 hour format.

Note Midnight is 12:00:00AM or 00:00:00 and 12 Noon is 12:00:00PM.

Input Format

Input consists of time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM 
where 
01≤hh≤12 
00≤mm≤59 
00≤ss≤59

Output Format

You need to print the time in 24 hour format i.e. hh:mm:ss 
where 
00≤hh≤23 
00≤mm≤59 
00≤ss≤59

Sample Input

07:05:45PM
Sample Output

19:05:45
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;


int main() {
    string input;
    cin>>input;
    int hour = stoi(input.substr(0,2));
    int min = stoi(input.substr(3,2));
    int second = stoi(input.substr(6,2));
    string amOrPm = input.substr(8,2);
    if(amOrPm == "PM" && hour < 12) {
        hour = (hour+12);
    }
    if(hour == 12 && amOrPm == "AM") {
        hour = 0;
    }
    cout<<hour<<":"<<min<<":"<<second<<endl;
    return 0;
}
