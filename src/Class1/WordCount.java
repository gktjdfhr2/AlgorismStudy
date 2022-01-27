package Class1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputStr;		
		inputStr=sc.nextLine();
		sc.close();
		StringTokenizer st = new StringTokenizer(inputStr, " ");
		System.out.println(st.countTokens());		
		
	}
}