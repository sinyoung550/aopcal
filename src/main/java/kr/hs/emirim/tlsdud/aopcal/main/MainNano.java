package kr.hs.emirim.tlsdud.aopcal.main;

import kr.hs.emirim.tlsdud.aopcal.cal.Calculator;
import kr.hs.emirim.tlsdud.aopcal.cal.ImpCalculator;
import kr.hs.emirim.tlsdud.aopcal.cal.RecCalculator;

public class MainNano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 1000;
		long start = System.nanoTime();	
		Calculator call = new ImpCalculator();
		long f1 = call.factorial(num);
		long end = System.nanoTime();
		System.out.printf("Imp factorial(%d) : 실행시간 = %d",num,(end-start));
		System.out.println();
		long start1 = System.nanoTime();	
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end1 = System.nanoTime();
		System.out.printf("Rec factorial(%d) : 실행시간 = %d",num,(end-start1));
	}

}
