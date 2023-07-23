package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer_1303 {
    static char[][] field;
    static boolean[][] visited;
    static int W = 0, B = 0;
    static final int[] dx = {1, 0, -1, 0};
    static final int[] dy = {0, 1, 0, -1};
    static int result = 1;
    static int row, col;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " " );
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());



        field = new char[row][col];
        visited = new boolean[row][col];
        for(int i = 0; i < row; i ++) {
            field[i] = br.readLine().trim().toCharArray();
        }

        for(int i = 0; i < row; i ++) {
            for (int j = 0; j < col; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < row; i ++) {
            for (int j = 0; j < col; j++) {
                if(visited[i][j] == false){
                    dfs(i, j);
                    switch (field[i][j])
                    {
                        case 'W':
                            W += result * result;
                            break;
                        case 'B':
                            B += result * result;
                            break;
                    }
                    result = 1;
                }

            }
        }
        System.out.println( W + " " + B );

    }

    public static void dfs(int y, int x) {

        visited[y][x] = true;

        int nx, ny;

        // 2차원 좌표에서 상하좌우를 조회하면서 깊이우선 탐색하기 위함
        for (int i = 0; i < 4; i ++) {
            nx = x + dx[i];
            ny = y + dy[i];

            // 설정된 좌표를 초과하는 좌표는 break
            if(nx < 0 || nx >= col || ny < 0 || ny >= row) {
                continue;
            }

            if(!(field[y][x] == field[ny][nx])) {
                continue;
            }

            if(visited[ny][nx] == false) {
                result++;
                dfs(ny, nx);
            }
        }
    }
    public static void bfs() {

    }
}
