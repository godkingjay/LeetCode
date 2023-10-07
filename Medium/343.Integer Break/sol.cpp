#include <iostream>

using namespace std;

int maxProduct(int n) {
    if (n == 2) {
        return 1;
    }

    int result = 1;

    if (n % 3 == 0) {
        // If n is a multiple of 3, use all 3s
        while (n > 0) {
            result *= 3;
            n -= 3;
        }
    } else if (n % 3 == 1) {
        // If n is 1 more than a multiple of 3, use one 4
        result *= 4;
        n -= 4;
        while (n > 0) {
            result *= 3;
            n -= 3;
        }
    } else {
        // If n is 2 more than a multiple of 3, use two 2s
        result *= 2;
        n -= 2;
        while (n > 0) {
            result *= 3;
            n -= 3;
        }
    }

    return result;
}

int main() {
     //CALL FUNCTION HERE

    return 0;
}
