package javaproject1;

import java.util.Scanner;

public class class14 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int e, g;

System.out.println("����� e � g");

e = scanner.nextInt();
g = scanner.nextInt();
if(e>g)
	System.out.println("���������� ����� " + e);
else
	System.out.println("���������� ����� " + g);
	}
}