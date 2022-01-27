package Class1;

import java.util.Scanner;

public class Nprint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i = 0; i < num; i++ ) {
			System.out.println(i+1);
		}
	}
}
