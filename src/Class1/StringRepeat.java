package Class1;

import java.util.Scanner;

public class StringRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inpStr;
		int pTime = sc.nextInt();
		int reTime;		
		
		for(int i=0; i<pTime; i++) {
			reTime = sc.nextInt();
			inpStr = sc.next();
			
			for(int j = 0 ; j < inpStr.length(); j++) {
				for(int k=0; k < reTime; k++) {
					System.out.print(inpStr.charAt(j));					
				}
				
			}
			System.out.println();
		}
		sc.close();
		
		
	}
}
