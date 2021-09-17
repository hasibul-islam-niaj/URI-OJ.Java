package solution_1958;

import java.text.DecimalFormat;
import java.util.Scanner;

class ScientificNotation2{
	Double n;
	String Formatter2(Double n){
		DecimalFormat df = new DecimalFormat("0.0000E00");
		String str = df.format(n);
		return str;
	}
	int Final2(String str){
		char str1[] = str.toCharArray();
		int length = str.length();
		for (int i=0; i<length; i++){
			if (i==0 && str1[0]!='-')
				System.out.print("+");
			else if (i>1 && str1[i-1]=='E' && str1[i]!='-') //Logic is changed here
				System.out.print("+");
			System.out.print(str1[i]);
		}
		System.out.println();
		return 0;
	}
}

public class Solution2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ScientificNotation2 sn2 = new ScientificNotation2();
		sn2.n = sc.nextDouble();
		sn2.Final2(sn2.Formatter2(sn2.n));
	}
}
