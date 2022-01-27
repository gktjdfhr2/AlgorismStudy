package Class1;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inNum = sc.nextInt();
		sc.close();
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",inNum, i, inNum * i );
		}
	}
}
