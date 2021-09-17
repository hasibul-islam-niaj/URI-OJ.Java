package solution_1958;

import java.text.DecimalFormat;
import java.util.Scanner;

class ScientificNotation3{
	Double n;
	String Formatter3(Double n){
		DecimalFormat df = new DecimalFormat("0.0000E00");
		String str = df.format(n);
		return str;
	}
	int Final3(String str){
		char str1[] = str.toCharArray();
		int length = str.length();
		for (int i=0; i<length; i++){
			if (i==0 && str1[0]!='-')
				System.out.print("+");
			System.out.print(str1[i]);
			if (str1[i]=='E' && str1[i+1]!='-') //Logic is Changed Here.
				System.out.print("+");
		}
		System.out.println();
		return 0;
	}
}

public class Solution3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ScientificNotation3 sn3 = new ScientificNotation3();
		sn3.n = sc.nextDouble();
		sn3.Final3(sn3.Formatter3(sn3.n));
	}
}
