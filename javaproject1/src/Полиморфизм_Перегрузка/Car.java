package �����������_����������;
/*
 * 
 * �����������
 * ����������
 * ������ Car, Ford
 * � ������ ford �� �����������(��������) ����� fordmodel, ����� �� ������� � ������� ������ ������ int � String
 * ���������� �� ���������� ���, ��� ���� ����� fordmodel ������������ � ������� �����������(int � String)
 * 
 */
public class Car {
	
	static int a = 4;
	static String b = "four";
	
	public static void main(String[] args) {
		
		Ford ford = new Ford();
		ford.fordmodel(a);
		ford.fordmodel(b);

}
}