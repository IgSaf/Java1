package �����������;

//*
//* �����������, ������ ������. �������� ����������� ��������(model, max Speed) ��� �������� �������(Ford)
//* ��� �������� ����������("Ford Mustang", 407) ��������� ������ ������
//* �����������, ��� �����, ������ ��� ���� ������������� ��������
//* �������� ������������ = �������� ������
//* this - ����� ��������� ������������ ����������(model) ������ �� ������������, � �� ����� ���������� ������  
//* 

public class �onstructor {

	   String model = "�������";
	   int maxSpeed;

	    �onstructor(String model, int maxSpeed) { // �����������
	      this.model = model;
	      this.maxSpeed = maxSpeed; 
	   }
	        
	    �onstructor(String model) { // �������������� �����������
	    	this.model = model; // ��� ����� this ������ SLK ����� �������
		   }
	    
	    �onstructor() { // - ��������� �����������, ���� �� ����� ���������� model � maxSpeed
	    	System.out.println("model � maxSpeed ����������");
		   }

	   public static void main(String[] args) {
		   �onstructor Ford = new �onstructor("Ford Mustang", 407);
	       System.out.println(Ford.model);
	       System.out.println(Ford.maxSpeed);	       
	       �onstructor Shevrolet = new �onstructor();
	       �onstructor Mersedes = new �onstructor("SLK");
	       System.out.println(Mersedes.model);
	   }

}