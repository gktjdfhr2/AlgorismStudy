import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Note {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row, col;
        char[][] field;
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        field = new char[row][col];
        for(int i = 0; i < row; i ++) {
            field[i] = br.readLine().toCharArray();
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j ++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }





    }
}
