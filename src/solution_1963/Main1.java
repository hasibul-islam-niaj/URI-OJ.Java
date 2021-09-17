package solution_1963;

import java.util.Scanner;
import java.text.DecimalFormat;

class TheMotionPicture1{
	String IncreaseRatio(double p, double i) {
		DecimalFormat twoDigitAfterDecimal = new DecimalFormat("0.00");
		
		double IncreasedPercentage;
		String FinalRatio;
		
		IncreasedPercentage = ((i-p)*100) / p;
		
		FinalRatio = twoDigitAfterDecimal.format(IncreasedPercentage);
		
		FinalRatio = FinalRatio + "%";
		return FinalRatio;
	}
}

public class Main1 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		TheMotionPicture1 tmp = new TheMotionPicture1();
		
		double PreviousPrice, IncreasedPrice;
		
		PreviousPrice = sc.nextDouble();
		IncreasedPrice = sc.nextDouble();
		
		System.out.println((tmp.IncreaseRatio(PreviousPrice, IncreasedPrice)));
	}
}
