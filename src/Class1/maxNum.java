package Class1;

import java.util.Scanner;

public class maxNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int maxnum = 0;
		int rank = 0;		
		
		for(int i = 0; i <9; i++) {
			input =sc.nextInt();
			if (maxnum < input) {
				maxnum = input;
				rank = i+1;
			}
		}		
		System.out.printf("%d\n%d",maxnum,rank);
	}
}
