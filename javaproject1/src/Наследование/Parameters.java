package ������������;

/*
*������������
*
*������: Parameters, Car, Shevrolet
*��� ������������� ������� � ���������� ������� ������ � ����� ���������
*����� shevrolet -  ���������(extends) ������ car
*� ������ car ��� ������ �� ������ shevrolet
*���������� ������������ ���(car => chevrolet => nasledovanie =>car - ������)
*
*/

public class Parameters{

public static void main (String[] args){
	
Chevrolet chevrolet = new Chevrolet();

System.out.println("��������: " + chevrolet.speed);//������� ���������� �� car
System.out.println("�����: " + chevrolet.weight());//������� ����� �� car
System.out.println("�����: " + chevrolet.types());//������� ����� �� car
System.out.println("�����: " + chevrolet.model);//������� ���������� �� chevrolet
}
}