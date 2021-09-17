package solution_1920;

import java.util.Scanner;

class Triangle{
	int a[] = new int[4];
	int sort(){
		for (int i = 0; i<4; i++){
			for (int j=i+1; j<4; j++){
				if (a[i]<a[j]){
					a[i] = a[i]+a[j];
					a[j]= a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		return 0;
	}
	char result(){
		if (a[1]+a[2]>a[0] || a[2]+a[3] >a[1]){
			return 'S';
		}
		else {
			return 'N';
		}
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		Triangle tr = new Triangle();
		int i;
		for (i=0; i<4; i++){
			tr.a[i] = sc.nextInt();
		}
		tr.sort();
		System.out.println(tr.result());
	}
}