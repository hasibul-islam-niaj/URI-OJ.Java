package solution_1963;

import java.util.Scanner;
import java.text.DecimalFormat;

class TheMotionPicture2{	
	double IncreaseRatio(double p, double i) {
		return ((i-p)*100) / p;
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat twoDigitAfterDecimal = new DecimalFormat("0.00");
		TheMotionPicture2 tmp = new TheMotionPicture2();
		
		double PreviousPrice, IncreasedPrice;
		
		PreviousPrice = sc.nextDouble();
		IncreasedPrice = sc.nextDouble();
		
		System.out.println(twoDigitAfterDecimal.format(tmp.IncreaseRatio(PreviousPrice, IncreasedPrice)) + "%");
	}
}
