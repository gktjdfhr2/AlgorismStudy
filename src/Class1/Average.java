package Class1;

import java.util.Scanner;

public class Average {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int[] inpArr (int x) {
		
		int []inpObjArr;
		inpObjArr = new int[x];
		
		for (int i =0; i<inpObjArr.length; i++) {
			inpObjArr[i] = sc.nextInt();			
		}
		
		return inpObjArr;
	}
	
	public static double fabricate(int[] x) {
		int max=0;
		double sum = 0;
		double avg;
		double[] fabArr;
		fabArr = new double[x.length];
		for (int i=0; i < x.length; i++) {
			if(max < x[i]) {
				max = x[i];			
			}			
		}
//		System.out.println("max = " + max);
		
		for (int i=0; i < x.length; i++) {
//			System.out.println("x[" + i + "] = " + x[i]);
			fabArr[i] = (double)( (double)x[i] / (double)max ) * 100;
//			System.out.println("fabArr[" + i + "] = " + fabArr[i]);
//			System.out.println("x[" + i + "] = " + x[i]);
			sum += fabArr[i];
		}
//		System.out.println("sum = " +sum);
		avg = sum/x.length;
		scannerClose();
		return avg;
	}
	
	public static void scannerClose() {
		sc.close();
	}
	
	public static void main(String[] args) {
		
		int ObjCnt;
		int [] Objarr;
		ObjCnt = sc.nextInt();
		Objarr= new int[ObjCnt];
		
		Objarr = inpArr(ObjCnt);
		System.out.println(fabricate(Objarr));
		
		
		
	}
}
