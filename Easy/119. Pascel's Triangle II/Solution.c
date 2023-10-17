// Solution 1
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
