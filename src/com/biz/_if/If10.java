package com.biz._if;

public class If10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 100; i++) {
			int m = (i % 5);
			if(m == 0) {
				System.out.println(i + "�� 5�� ���");
			} else if(i % 4 == 0) {
				System.out.println(i + "�� 4�� ���");
			} else if(i % 3 == 0) {
				System.out.println(i + "�� 3�� ���");
			} else if(i % 2 == 0) {
				System.out.println(i + "�� 2�� ���");
			} else {
				System.out.println("����");
			}
		}

	}

}