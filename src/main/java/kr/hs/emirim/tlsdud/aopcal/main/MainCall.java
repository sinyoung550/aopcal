package kr.hs.emirim.tlsdud.aopcal.main;

import kr.hs.emirim.tlsdud.aopcal.cal.Calculator;
import kr.hs.emirim.tlsdud.aopcal.cal.ImpCalculator;
import kr.hs.emirim.tlsdud.aopcal.cal.RecCalculator;

public class MainCall {

	public static void main(String[] args) {
		long num = 100;
		long start = System.currentTimeMillis();	
		Calculator call = new ImpCalculator();
		long f1 = call.factorial(num);
		long end = System.currentTimeMillis();
		System.out.printf("Imp factorial(%d) : 실행시간 = %d",num,(end-start));
		System.out.println();
		long start1 = System.currentTimeMillis();	
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end1 = System.currentTimeMillis();
		System.out.printf("Rec factorial(%d) : 실행시간 = %d",num,(end-start1));

	}

}
