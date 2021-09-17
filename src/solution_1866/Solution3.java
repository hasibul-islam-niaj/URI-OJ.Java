package solution_1866;

import java.util.Scanner;
/*
 * Author:~ Hasibul Islam
 * package keyword is not allowed to URI
 */

class Bill3{
	int n;
	int gnrts(){
		int i, sum=0, flag=0;
		for (i=1; i<=n; i++){
			if (flag==0){
				sum += 1;
				flag = 1;
			}
			else {
				sum -= 1;
				flag = 0;
			}
		}
		return sum;
	}
}

public class Solution3 {
	/*
	 * to submit, you must define class main as Main
	 */
	private static Scanner sc;
	public static void main (String[] args){
		sc = new Scanner(System.in);
		Bill3 bl = new Bill3();
		int t, i;
		t = sc.nextInt();
		for (i=0; i<t; i++){
			bl.n = sc.nextInt();
			System.out.println(bl.gnrts());
		}
	}
}