package pattern;

import java.util.Scanner;

public class Patten {
	static void pattern1() {
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		} 	
		
	}
	
	static void pattern2() {
		for (int i=4; i>=0 ; i--){
			for (int j=0; j<=i; j++){
				System.out.print("*" + " ");
			}
			System.out.println();
	    }
	}
	static void pattern3() {
		for (int i=0; i<=5; i++) {
			System.out.println("");
			for (int x=0; x<=i; x++) {
				System.out.println('*');
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int value=scan.nextInt();
		
		if (value==1) {
			pattern1();
		}
		else if (value==2){
			pattern2();
		}
		else if (value==3) {
			pattern3();
		}
		

	}

}
