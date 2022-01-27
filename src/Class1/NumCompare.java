package Class1;

import java.util.Scanner;

public class NumCompare {
	
	public static String comp(int x, int y) {
		String result;
		if (x > y) {
			result = ">";
		}
		else if (x < y) {
			result = "<";
		}
		else {
			result="==";
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		System.out.println(comp(a,b));
		
		
	}
}
