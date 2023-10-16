#include <stdio.h>
#include <stdlib.h>

int* getRow(int r, int* rS) {
    int* ans = (int*)calloc(r + 1, sizeof(int));
    long temp = 1;
    ans[0] = 1;
    for (int i = 1, up = r; i <= r; i++, up--) {
        temp = temp * up / i;
        ans[i] = (int)temp;
    }
    *rS = r + 1;
    return ans;
}

int main() {
    int rowNumber;  scanf("%d",&rowNumber);  // You can change this to the desired row number
    int size;
    int* result = getRow(rowNumber, &size);

    printf("[");
    for (int i = 0; i < size; i++) {
        printf("%d", result[i]);
        if (i < size - 1) {
            printf(", ");
        }
    }
    printf("]\n");

    // Don't forget to free the memory allocated for the result
    free(result);

    return 0;
}
