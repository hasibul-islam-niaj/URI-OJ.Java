package Solution_1958;

import java.text.DecimalFormat;
import java.util.Scanner;

class ScientificNotation{
	Double n;
	String Formatter(Double n){
		DecimalFormat df = new DecimalFormat("0.0000E00");
		String str = df.format(n);
		return str;
	}
	int Final(String str){
		char str1[] = str.toCharArray();
		int length = str.length();
		for (int i=0; i<length; i++){
			if (i==0 && str1[0]!='-')
				System.out.print("+");
			else if ((i==7 || i==8) && (str1[i-1]=='E' && str1[i]!='-'))
				System.out.print("+");
			System.out.print(str1[i]);
		}
		System.out.println();
		return 0;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ScientificNotation sn = new ScientificNotation();
		sn.n = sc.nextDouble();
		sn.Final(sn.Formatter(sn.n));
	}
}
