package Class1;

import java.util.Scanner;

public class starWrite_1 {
	//문자열 사용	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		String star="";
		cnt = sc.nextInt();
		sc.close();
		for(int i=0; i < cnt; i++) {
			star +="*";
			System.out.println(star);
		}
	}
	//	이중반복문
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int cnt;		
//		cnt = sc.nextInt();
//		
//		for(int i=0; i < cnt; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
}
