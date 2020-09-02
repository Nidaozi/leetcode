package HUAWEI;


import java.util.*;

public class problem2 {
    static class Pair {
        int i, j;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return i == pair.i &&
                    j == pair.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));
        int[][] hash = new int[200][200];
        Pair zhong = new Pair(n - 1, m - 1);
        if (n == 1 && m == 1 && s > 1) {
            System.out.println(0);
            return;
        }
        while (!queue.isEmpty()) {
            Pair poll = queue.poll();

            int i = poll.i;
            int j = poll.j;
            if (i == n - 1 && j == m - 1) {
                System.out.println(1);
                return;
            }
            if (i + s < n && nums[i + s][j] == 1 && hash[i + s][j] == 0) {
                hash[i + s][j]++;
                queue.add(new Pair(i + s, j));
            }
            if (i - s >= 0 && nums[i - s][j] == 1 && hash[i][i - s] == 0) {
                hash[i - s][j]++;
                queue.add(new Pair(i - s, j));
            }
            if (j + s < m && nums[i][j + s] == 1 && hash[i][j + s] == 0) {
                hash[i][j + s]++;
                queue.add(new Pair(i, j + s));
            }
            if (j - s >= 0 && nums[i][j - s] == 1 && hash[i][j - s] == 0) {
                hash[i][j - s]++;
                queue.add(new Pair(i, j - s));
            }

        }
        System.out.println(0);
    }
}
