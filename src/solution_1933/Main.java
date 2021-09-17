package solution_1933;

import java.util.Scanner;

class TriDu{
	int winner(int a, int b){
		if (a>b){
			return a;
		}
		else if(b>a){
			return b;
		}
		else
			return a;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		TriDu td = new TriDu();
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(td.winner(a,b));
		System.exit(0);
	}
}
