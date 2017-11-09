package Solution_1933;

import java.util.Scanner;

class TriDu1{
	int winner1(int a, int b){
		if (a>b)
			return a;
		else 
			return b;
	}
}

public class Main1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TriDu1 td1 = new TriDu1();
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(td1.winner1(a,b));
	}
}
