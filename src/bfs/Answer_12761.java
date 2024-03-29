package bfs;

import java.io.*;
import java.util.*;

public class Answer_12761 {

    static int A, B, N, M;

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        // 입력 끝
        System.out.println(bfs());
    }

    static int bfs() {
        // 돌다리 생성
        int[] stones = new int[100001];

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(N);
        stones[N] = 1;

        while (!q.isEmpty()) {
            int x = q.poll();
            if (x == M) {
                return stones[x] - 1;
            }
            for (int d = 0; d < 8; d++) {
                int nx = move(d, x);
                if (isIn(nx) && stones[nx] == 0) {
                    stones[nx] = stones[x] + 1;
                    q.offer(nx);
                }
            }
        }
        return stones[M] - 1;
    }

    static int move(int d, int x) {
        if (d == 0) return x - 1;
        else if (d == 1) return x + 1;
        else if (d == 2) return x - A;
        else if (d == 3) return x + A;
        else if (d == 4) return x - B;
        else if (d == 5) return x + B;
        else if (d == 6) return x * A;
        else return x * B;
    }

    static boolean isIn(int x) {
        return 0 <= x && x <= 100000;
    }
}