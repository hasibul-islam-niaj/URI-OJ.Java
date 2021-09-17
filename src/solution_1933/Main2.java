package solution_1933;

import java.util.Scanner;

class TriDu2{
	int winner2(int a, int b){
		return a>b ? a:b;
	}
}

public class Main2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TriDu2 td2 = new TriDu2();
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(td2.winner2(a, b));
	}
}
