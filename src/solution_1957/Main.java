package solution_1957;

import java.util.Scanner;
/*Author: Hasibul Islam */
class ConvertingToHexadecimal{
	String ValueGenerator(long Value){
		if (Value==10)
			return "A";
		else if (Value == 11)
			return "B";
		else if (Value == 12)
			return "C";
		else if (Value == 13)
			return "D";
		else if (Value == 14)
			return "E";
		else if (Value == 15)
			return "F";
		
		return null;
	}
	String HexaDecimalValue(long n){
		String FinalHexaCode = "";
		long ModValue;
		while (n!=0){
			ModValue = n%16;
			if (ModValue<16 && ModValue>9){
				FinalHexaCode = FinalHexaCode + ValueGenerator(ModValue);
			}
			else if (ModValue <= 9)
				FinalHexaCode =  FinalHexaCode +ModValue;
			else if (n<16 && n>9){
				FinalHexaCode = FinalHexaCode + ValueGenerator(n);
			}
			else 
				FinalHexaCode = FinalHexaCode + n;
			n = n/16;
		}
		return FinalHexaCode;
	}
}
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		ConvertingToHexadecimal cth = new ConvertingToHexadecimal();
		
		long DecimalValue;
		DecimalValue = sc.nextLong();
		if (DecimalValue<16 && DecimalValue>9)
			System.out.println(cth.ValueGenerator(DecimalValue));
		else{
			String str = cth.HexaDecimalValue(DecimalValue);
			int len = str.length();
			char a[] = str.toCharArray();
			for (int i=len-1; i>=0; i--)
				System.out.print(a[i]);
			System.out.println();
		}
		System.exit(0);
	}
}