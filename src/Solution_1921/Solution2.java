package Solution_1921;

import java.util.Scanner;

class GuilhermeandKites2{
	long determinestable(long m){
		m = (m*(m-3))/2;
		/*m = (m*(m-3))/2;
		 *or,
		 *m = (m*(m+1)/2)-2*m;
		 */
		return m;
	}
}

public class Solution2 {
	private static Scanner sc;
	private static GuilhermeandKites2 gk;
	public static void main (String[] args){
		sc = new Scanner(System.in);
		gk = new GuilhermeandKites2();
		long n = sc.nextInt();
		System.out.println(gk.determinestable(n));
	}
}