package HUAWEI;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class 迷宫 {

    public static void main(String[] args) {
        char[][] mi = new char[][]{{'#', 'S', '#'}, {'.', '.', '.'}, {'E', '#', '#'}};
        boolean[][] booleans = new boolean[mi.length][mi.length];
        for (int i = 0; i < mi.length; i++) {
            int result = 1;
            boolean flag = true;
            for (int j = 0; j < mi.length; j++) {
                if (mi[i][j] == 'S') {
                    Queue<Pair> queue = new LinkedList<>();
                    queue.add(new Pair(i, j));
                    int precount = 1;

                    int curcount = 0;
                    while (!queue.isEmpty()) {
                        Pair poll = queue.poll();
                        int l = poll.i;
                        int m = poll.j;
                        if (mi[poll.i][poll.j] == 'E') {
                            flag = false;
                            break;
                        }
                        if (l > 0 && (mi[l - 1][m] == '.' || mi[l - 1][m] == 'E') && booleans[l - 1][m] == false) {
                            queue.add(new Pair(l - 1, m));
                            booleans[l - 1][m] = true;
                            curcount++;
                        }
                        if (m > 0 && (mi[l][m - 1] == '.' || mi[l][m - 1] == 'E') && booleans[l][m - 1] == false) {
                            queue.add(new Pair(l, m - 1));
                            booleans[l][m - 1] = true;
                            curcount++;
                        }
                        if (m < mi.length - 1 && (mi[l][m + 1] == '.' || mi[l][m + 1] == 'E') && booleans[l][m + 1] == false) {
                            queue.add(new Pair(l, m + 1));
                            booleans[l][m + 1] = true;
                            curcount++;
                        }
                        if (l < mi.length - 1 && (mi[l + 1][m] == '.' || mi[l + 1][m] == 'E') && booleans[l + 1][m] == false) {
                            queue.add(new Pair(l + 1, m));
                            booleans[l + 1][m] = true;
                            curcount++;
                        }
                        precount--;
                        if (precount == 0) {
                            result++;
                            precount = curcount;

                        }
                    }
                    if (!flag) {
                        System.out.println(result);
                        return;
                    }
                }

            }
        }
    }

    static class Pair {
        int i;
        int j;

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
}
