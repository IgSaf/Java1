package �����������_����������;

/*
 * 
 * �����������
 * ����������/���������������
 * ������ Car, Ford, Ford_plus
 * � ford2 �� �������������� ����� fordmodel(��������� plus) �� ford, ����� �� �������� ��� � ford
 * ���������� �� ���������� ���, ��� � ������ ����������� ����� ���������� ��� ���� ������(��������� plus)
 * 
 */
public class Car {
	
	static int a = 5;
	static String b = "five";
	public static void main(String[] args) {

	Ford_plus ford2 = new Ford_plus();
	ford2.fordmodel(a);
	ford2.fordmodel(b);
	}
}
