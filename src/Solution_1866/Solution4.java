package Solution_1866;
/*
 * Author:~ Hasibul Islam
 * package keyword is not allowed to URI
 */
import java.util.Scanner;

class Bill4{
	int n;
	int gnrts(){
		int i, sum=0;
		for (i=1; i<=n; i++){
			if (i%2==0){
				sum -= 1;
			}
			else {
				sum += 1;
			}
		}
		return sum;
	}
}

public class Solution4 {
	/*
	 * to submit, you must class main as Main
	 */
	private static Scanner sc;
	public static void main (String[] args){
		sc = new Scanner(System.in);
		Bill4 bl = new Bill4();
		
		int t, i;
		t = sc.nextInt();
		for (i=0; i<t; i++){
			bl.n = sc.nextInt();
			System.out.println(bl.gnrts());
		}
	}
}