package �����������;
/*
*�����������
*������: class23, car, chevrolet1, chevrolet2
*������ chevrolet1 � chevrolet2 ���������� ��������� ������ car ��� �������� ������������ ���������� (����� �������� ����� ���� ��������� ��� ���� ������)
*������ chevrolet1 � chevrolet2 - ���������� ������ car
*����� class23 ������� ������� car1 � car2 ���� chevrolet1 � chevrolet2 
*/

public class Parameters {

public static void main (String[] args){
Car car1 = new Chevrolet1();
Car car2 = new Chevrolet2();
System.out.println("����� Chevrolet 1: " + car1.weight());
System.out.println("����� Chevrolet 2: " + car2.weight());
}
}