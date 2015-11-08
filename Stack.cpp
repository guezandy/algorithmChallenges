#include <iostream>
#include <string>
#include <vector>
#include <stack>


using namespace std;
int main() {
    stack<int> mStack;
    int N;
    string c, op;
    cin >> N;
    for(int i = 0; i < N+1; i++) {
        getline(cin,c);
        int pos = c.find(" ");
        op = c.substr(0,pos);
        //cout<<op<<" "<<num<<endl;
        if(op == "push"){
            //cout<<stoi(c.substr(pos+1))<<endl;
            mStack.push(stoi(c.substr(pos+1)));
            //cout<<"PUSH: "<<num;
        } else if(op == "pop") {
            mStack.pop();
        } else if(op == "inc") {
            
        }
        if(mStack.size() > 0) {
            cout<<mStack.top()<<endl;
        } else {
            cout<<"EMPTY"<<endl;
        }
    }
    return 0;
}