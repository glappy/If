package com.biz._if;

public class If11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strName = "Ŀ�ǹͽ�";
		int intValue = 2000;
		
		if(strName == "�޹�") {
			System.out.println("VAT�� 10% �Դϴ�");
			System.out.println("���� ������: " 
					+ (intValue * 0.1) + "�Դϴ�");
		}
		if(strName == "���ö�") {
			System.out.println("VAT 7%�Դϴ�");
			System.out.println("���� ������:"
					+ (intValue * 0.07) + "�Դϴ�");
		}
		if(strName == "Ŀ�ǹͽ�") {
			System.out.println("VAT 12%�Դϴ�");
			System.out.println("���� ������:"
					+ (intValue * 0.12) + "�Դϴ�");
		}

		
	}

}