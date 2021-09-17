package solution_1866;
/*
 * Author Hasibul Islam
 * package keyword is not allowed to URI.
 */
import java.util.Scanner;

class Bill2{
	int n;
	int gnrtsum(){
		return n%2;
	}
}

public class Solution2 { 
/*
 * to submit, you must define class main as Main
 */
	public static void main(String[] args){
		Bill2 bl = new Bill2();
		Scanner sc = new Scanner(System.in);
		int t, i;
		t = sc.nextInt();
		for (i=0; i<t; i++){
			bl.n = sc.nextInt();
			System.out.println(bl.gnrtsum());
		}
	}
}