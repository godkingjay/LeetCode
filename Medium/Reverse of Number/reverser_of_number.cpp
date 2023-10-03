#include <iostream>
using namespace std;
#include <cmath>

int main()
{

    // leetcode reverse of an integer

    int n = 0,a;
    cin >> a;
    while (a != 0)
    {
        if ((a > INT32_MAX / 10 || a < INT32_MIN / 10))
        {
            return 0;
        }
        n = (n * 10) + (a % 10);
        a = a / 10;
    }
    cout << n;

    return 0;
}