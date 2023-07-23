package programmers.answer;

import java.util.ArrayList;
import java.util.List;

public class Answer_169198 {

    //	10, 10, 3, 7, [[7, 7], [2, 7], [7, 3]]
    public static int[] solution(int m, int n, int startX, int startY, int[][] balls) {

        for ( int [] position: balls) {
            int moveDistance = 0;
            int distance = 0;
            if(startX > position[0]) {
               distance = startX- position[0];
            } else {
                distance = position[0] - startX;
            }
        }

        int[] answer = {};
        return answer;
    }
    public static void main(String [] args) {
        int[] result = solution(10,10,3,7, new int[][]{{7, 7}, {2, 7}, {7, 3}});





    }

}
