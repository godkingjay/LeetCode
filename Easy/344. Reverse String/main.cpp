#include <iostream>
using namespace std;
int main() {
    char s[] = {'h', 'e', 'l', 'l', 'o'};
    int n = sizeof(s)/sizeof(s[0]);
    char t[n];
    for(int i = n - 1; i >= 0; i--){
        t[n - i - 1] = s[i];
    }
    for(int i = 0; i < n; i++){
        cout << t[i];
    }

    return 0;
}