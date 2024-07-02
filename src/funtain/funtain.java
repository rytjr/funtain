package funtain;

import java.util.*;

public class funtain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = num;
		int t = 1;
		int s = 0;
		
		if(num == 1) {
			System.out.print(1 + "/" + 1);
		}
		else {
			for(int i = 1; i < 100000000; i++) { 
				num = num -i;
				if(num <= i+1) {
					if((i+1)%2 == 0) {
						s = i+1;
						if(num ==1) {
							System.out.print(t + "/" + s);
							break;
						}
						else {
							for(int j =1; j < num; j++) {
								--s;
								++t;
	
							}
							System.out.print(t + "/" + s);
							break;
						}
					}
					else {
						s = i+1;
						if(num ==1) {
							System.out.print(s + "/" + t);
							break;
						}
						else {
							for(int j =1; j < num; j++) {
								--s;
								++t;
								
							}
							System.out.print(s + "/" + t);
							break;
						}
					}
				}
			}
		}
	}
}