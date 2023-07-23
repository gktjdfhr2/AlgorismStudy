package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Answer_1926 {

    static int tempCnt = 0,cnt = 0, n, m;
    static int max = Integer.MIN_VALUE;
    static String [][] field;
    static boolean [][] visited;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ") ;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        field = new String[n][m];
        visited = new boolean[n][m];


        for(int i = 0; i < n; i ++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < m; j++) {
                field[i][j] = st.nextToken();
            }
        }


        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j++) {
                if(visited[i][j] == false && field[i][j].equals("1")) {
                    cnt++;
                    tempCnt++;
                    dfs(i,j);
                    if(max < tempCnt) {
                        max = tempCnt;
                    }
                    tempCnt = 0;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    static void dfs(int y, int x) {
        visited[y][x] = true;

        int nx, ny;
        for(int i = 0; i < dx.length; i++ )
        {
            nx = x + dx[i];
            ny = y + dy[i];

            // 좌표를 초과하는 범위 처리
            if(nx < 0 || nx >= m || ny< 0 || ny >= n) {
                continue;
            }

            if(field[ny][nx].equals("1") && visited[ny][nx] == false) {
                tempCnt++;
                dfs(ny, nx);
            }
        }
    }

}
