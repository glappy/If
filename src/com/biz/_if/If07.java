package com.biz._if;

public class If07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 0;
		for(intNum = 0; intNum < 100 ; intNum++) {
			System.out.println(intNum);
		}
		System.out.println("Last Num:" + intNum);
	
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		
		int intCount = 0;
		while(true) {
			if(++intCount > 10) break;
			System.out.println(intCount + "¥Î«—πŒ±π");
		}
		
		intCount = 0;
		while(true) {
			if(intCount > 10) break;
			System.out.println(++intCount + "¥Î«—πŒ±π");
		}

		intCount = 0;
		while(intCount++ < 10) {
			System.out.println(intCount + "¥Î«—πŒ±π");
		}
	}
}



