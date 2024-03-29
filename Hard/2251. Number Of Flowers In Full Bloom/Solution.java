class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        Arrays.sort(flowers, Comparator.comparingInt(a -> a[0]));
        int[] ans = new int[persons.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.j));
        int j = 0;
        int[][] t = new int[persons.length][2];
        for (int i = 0; i < persons.length; i++) {
            t[i][0] = persons[i];
            t[i][1] = i;
        }
        Arrays.sort(t, Comparator.comparingInt(a -> a[0]));
        for (int[] ints : t) {
            while (!pq.isEmpty()) {
                if (pq.peek().j < ints[0]) {
                    pq.poll();
                } else {
                    break;
                }
            }
            while (j < flowers.length) {
                if (flowers[j][0] <= ints[0] && flowers[j][1] >= ints[0]) {
                    pq.add(new Pair(flowers[j][0], flowers[j][1]));
                    j++;
                    continue;
                }
                if (flowers[j][1] < ints[0]) {
                    j++;
                    continue;
                }
                break;
            }
            ans[ints[1]] = pq.size();
        }
        return ans;
    }

    private static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}