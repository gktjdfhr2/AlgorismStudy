package programmers.answer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Answer_1260 {

    static int point, line, start;
    static int [][] connect;
    static boolean[] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        point = sc.nextInt(); line = sc.nextInt(); start = sc.nextInt();
        connect = new int[point + 1][point + 1];
        visited = new boolean[point + 1];



        for (int i = 1; i <= line; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            connect[x][y] = connect[y][x] = 1;
        }

        dfs(start);

        visited = new boolean[point + 1];
        System.out.println();
        bfs();


    }

    public static void dfs(int start)
    {
        visited[start] = true;
        System.out.print( start + " ");
         for (int i = 1; i <= point; i ++)
         {
            if(visited[i] == false && connect[start][i] == 1)
            {
                dfs(i);
            }
         }


    }

    public static void bfs(){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        visited[start] = true;
        System.out.print(start + " ");
        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int j = 1; j <= point; j++) {
                if(connect[temp][j] == 1 && visited[j] == false) {  // 노드가 연결됐는지와 방문했던 노드인지 체크
                    queue.offer(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }


}
