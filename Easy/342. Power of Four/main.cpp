#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int num = 16;
    int p = 4;
    int s = (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
    cout << num << " is a power of 4 is: " << (s ? "true" : "false");
    return 0;
}