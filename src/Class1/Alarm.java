package Class1;

import java.util.Scanner;

public class Alarm {
	public static void main(String [] args) {
		int hour,minute;
		Scanner sc = new Scanner(System.in);
		
		hour= sc.nextInt();
		minute = sc.nextInt();
		sc.close();
		if(minute<45) {
			if(hour==0) {
				System.out.printf("%d %d",23,15+minute);
			}
			else
			System.out.printf("%d %d",hour-1,15+minute);			
		}
		else
			System.out.printf("%d %d",hour,minute-45);	
	}
	
}