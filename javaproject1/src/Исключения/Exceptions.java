package ����������;


/*
*
* ����������
* ���������� - ������ ���������, ������� ������� � ������������(try, catch, finnaly)
* ���������� ����� ��� ������������ ������ � ������������� ������ ���������
* ���� ��� ���� ����������: Exception � RunTimeExeption
* Exception - ����������� ���������� - ����������, ������� ���������� ����� ������� � �� ����������� ���, ��� �� ���������
* RunTimeException - ������������� ���������� - ����������, ������� ���������� � ������ ���������, � ��� ���������� �� �����
* Throw �������� ����� ��� �������� ����������� ����������
*
*/

import java.util.Scanner;

public class Exceptions {
	
	static void tx (int a, int b) { //����� ��� ����������� ����������
		if (a<b) {//������� ����������
		throw new NullPointerException("a<b");//NullPointerException - ��� ����������, a<b - ����� ��������(�������) ����� ������ ������
      //throw ��� ����������� ����������
		}
	}
	
	public static void main(String[] args) {
		   
		Exceptions tx = new Exceptions();
		
		   try { // ����� ����, ��� ����� ���� ����������
			   System.out.println("����� a");
			   int a = new Scanner(System.in).nextInt();
			   System.out.println("����� b");
				 int b = new Scanner(System.in).nextInt();
				 
				 Exceptions.tx(a,b); // ����� ���������� ����������, ����� ���� ��������� �� ��������
	 
				 System.out.println("a / b = " + a/b);	 
		   }
		   
		  catch (ArithmeticException e) { // ����� ����, ��� �������������� ����������
			   //ArithmeticException - ���������� ��� ������� �� ����
			   System.out.println("�� ���� �� �����!");
			   System.out.println("��� ���!");
			   main(args);
			   }
		   
		  catch (NullPointerException e) { //���������� �� ������ xt
			   System.out.println("A ������ B!");
			   System.out.println("��� ���!");
			   main(args);
		  }
		   
		   catch (Exception e) { // Exception - ����� ����������
			   System.out.println("��� ���!");
			   main(args);
		  }
		   
		   finally { //�������������� ���� ����, ������� ����������� � ����� ������
			   System.out.println("finally!");
			   
		   }

	   }  
}		