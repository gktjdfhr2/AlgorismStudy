package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HSR_2217 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			rope[i]= Integer.parseInt(br.readLine());
			if (rope[i] < min) {
				min = rope[i];
			}
		}
		System.out.println(min * N);	
	}
}
