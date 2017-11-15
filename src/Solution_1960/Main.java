package Solution_1960;

import java.util.Scanner;

class RomanNumeralsforPageNumbers{
	String number;
	
	String Single(char digit){
		if (digit=='1')
			return "I";
		else if (digit=='2')
			return "II";
		else if (digit=='3')
			return "III";
		else if (digit=='4')
			return "IV";
		else if (digit=='5')
			return "V";
		else if (digit=='6')
			return "VI";
		else if (digit=='7')
			return "VII";
		else if (digit=='8')
			return "VIII";
		else if (digit=='9')
			return "IX";
		else
			return "";
	}
	
	String Double(char digit){
		if (digit=='1')
			return "X";
		else if (digit=='2')
			return "XX";
		else if (digit=='3')
			return "XXX";
		else if (digit=='4')
			return "XL";
		else if (digit=='5')
			return "L";
		else if (digit=='6')
			return "LX";
		else if (digit=='7')
			return "LXX";
		else if (digit=='8')
			return "LXXX";
		else if (digit=='9')
			return "XC";
		else
			return "";
	}
	
	String Triple(char digit){
		if (digit=='1')
			return "C";
		else if (digit=='2')
			return "CC";
		else if (digit=='3')
			return "CCC";
		else if (digit=='4')
			return "CD";
		else if (digit=='5')
			return "D";
		else if (digit=='6')
			return "DC";
		else if(digit=='7')
			return "DCC";
		else if (digit=='8')
			return "DCCC";
		else if (digit=='9')
			return "CM";
		else
			return null;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		RomanNumeralsforPageNumbers rnpn = new RomanNumeralsforPageNumbers();
		rnpn.number = sc.next();
		
		char CpyNum[] = rnpn.number.toCharArray();
		
		if (rnpn.number.length()==3){
			System.out.println(rnpn.Triple(CpyNum[0])+rnpn.Double(CpyNum[1])+rnpn.Single(CpyNum[2]));
		}
		else if (rnpn.number.length()==2)
			System.out.println(rnpn.Double(CpyNum[0])+rnpn.Single(CpyNum[1]));
		else 
			System.out.println(rnpn.Single(CpyNum[0]));
	}
}
