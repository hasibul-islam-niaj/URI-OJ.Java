package solution_1963;

import java.util.Scanner;
import java.text.DecimalFormat;

class TheMotionPicture{
	double PreviousPrice, IncreasedPrice;
	
	double IncreaseRatio(double p, double i) {
		double IncreasedPercentage;
		IncreasedPercentage = ((i-p)*100) / p;
		return IncreasedPercentage;
	}
}

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		DecimalFormat twoDigitAfterDecimal = new DecimalFormat("0.00");
		TheMotionPicture tmp = new TheMotionPicture();
		
		tmp.PreviousPrice = sc.nextDouble();
		tmp.IncreasedPrice = sc.nextDouble();
		
		System.out.println(twoDigitAfterDecimal.format(tmp.IncreaseRatio(tmp.PreviousPrice, tmp.IncreasedPrice)) + "%");
	}
}
