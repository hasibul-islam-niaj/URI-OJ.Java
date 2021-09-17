package solution_1962;

import java.util.Scanner;

class ALongTimeAgo{
	int year, testCase;
	
	int HappenedBC_AD(int year) {
		if (year < 2015)
			System.out.println(2015-year + " D.C.");
		else 
			System.out.println(year-2014 + " A.C.");
		return 0;
	}
}

public class Main {
	public static void main(String[] args) {
		ALongTimeAgo alta = new ALongTimeAgo();
		Scanner sc = new Scanner (System.in);
		
		int i=1;
		
		alta.testCase = sc.nextInt();
		
		while (i<=alta.testCase) {
			alta.year = sc.nextInt();
			alta.HappenedBC_AD(alta.year);
			i++;
		}
		
		System.exit(0);
	}
}
