package kr.hs.emirim.tlsdud.aopcal.main;

import kr.hs.emirim.tlsdud.aopcal.cal.Calculator;
import kr.hs.emirim.tlsdud.aopcal.cal.ImpCalculator;
import kr.hs.emirim.tlsdud.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		Calculator call = new ImpCalculator();
		long f1 = call.factorial(100);
		System.out.println("Imp 4 : " + f1);
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		System.out.println("Rec 4 : " + f2);

	}

}
