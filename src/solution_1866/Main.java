package solution_1866;
/*
 * Hasibul Islam
 * Read Problem attetively.
 * Very Simple Problem.
 */
import java.util.Scanner;

class Bill{
	int n;
	int gnrts(){ //generate Summation of Series.
		int s=1;	
		if (n%2==0){
			s = 0;
		}
		return s;
	}
}

public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		Bill bl = new Bill();
		int t, i;
		t = sc.nextInt();
		
		for (i=0; i<t; i++){
			bl.n = sc.nextInt();
			System.out.println(bl.gnrts());
		}
	}
}