package com.biz._if;

public class If08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intCount = 0;
		int intSum = 0;
		
		// 1���� ���ڸ� ���ؼ�
		// �� ���� 10000 (�̻�)�� �ɶ�
		// �󸶱��� �������� �Ǵ���
		// �˾ƺ��� �ʹ�.
		while(true) {
			intCount ++ ;
			intSum += intCount;
			if(intSum >= 10000) break;
		}
		System.out.println("intSum:" + intSum);
		System.out.println("intCount:" + intCount);
		
		intSum = 0;
		for(int i = 1 ; i <= 141 ; i++) {
			intSum += i;
			System.out.println(intSum);
		}
		
		intSum = 0;
		for(int i = 1 ; true ; i++) {
			intSum += i;
			System.out.println(intSum);
			if(intSum >= 10000) break;
		}
		
	}

}