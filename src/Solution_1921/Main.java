package Solution_1921;

import java.util.Scanner;

class GuilhermeAndKites{
	long determinestring(long m){
		long i, sum=0;
		for (i=1; i<=m; i++){
			sum = sum+i;
		}
		return sum;
	}
}

public class Main {
	private static GuilhermeAndKites gk;
	private static Scanner sc;
	
	public static void main(String[] args){
		gk = new GuilhermeAndKites();
		sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println((gk.determinestring(n))-2*n);
		System.exit(0);
	}
}