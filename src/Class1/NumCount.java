package Class1;

import java.util.Scanner;

public class NumCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrList; 
		int a,b,c;
		String parseResult="";
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();	
		sc.close();
		int result = a * b * c;
//		System.out.println(result);
		parseResult = String.valueOf(result);
		
		arrList = new int[10];
		
//		System.out.println(parseResult);
		
		for (int i = 0; i < parseResult.length(); i++) {			
			arrList[(int)((int)parseResult.charAt(i))-48] +=1;
//			System.out.println((int)((int)parseResult.charAt(i))-48);
		}
		
		for (int i = 0; i < arrList.length; i++) {
			System.out.println(arrList[i]);
		}
	}
}
