package randomNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class randomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan=new Scanner(System.in);
		List<Integer>list=new ArrayList<Integer>();//converting Array to list
		System.out.print("Input:-");
		int number =scan.nextInt();
		
		int i=0;
		while (i<=number) {
//			System.out.println(i);
			int number_depict=random.nextInt(number);
			
//			System.out.println(number_depict+"number depicted");
			
			list.add(number_depict);
			i+=1;
			
			
		}
		System.out.println(list+"list");
		for (int x=0; x<list.size()-1;x++) {
//			System.out.println(list.get(x)+"x");
			for (int k=x+1; k<list.size(); k++) {
				if(list.get(x)==list.get(k)) {
					list.remove(k);
					System.out.println(list+"k_remover list");
//					list.add(x);
				}
				else {
					System.out.println(list+"list");
					
				}
			}
		}


	}

}
