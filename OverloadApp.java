package oop;

public class OverloadApp {
	public static void main(String[] args) {
		Overload overload=new Overload();
		
		overload.displayInt(100);
		//�޼ҵ� ȣ��� �Ű������� �߸��� ���� ������ ��� ���� �߻�
		//overload.displayInt(false);
		overload.displayBoolean(false);
		overload.displayString("ȫ�浿");
		System.out.println("===================================================");
		//�����ε� ����� �޼ҵ�� �Ű������� ���޵Ǵ� ���� ���� �޼ҵ带 ���� ȣ��
		// => �޼ҵ� �����ε忡 ���� ������
		//������(Polymorphism) : ���� �̸��� �޼ҵ带 ȣ���ص� ���¿� ���� �޼ҵ带
		//�����Ͽ� ȣ���ϴ� ��� => �޼ҵ� �����ε�, �޼ҵ� �������̵�
		overload.display(200);
		overload.display(true);
		overload.display("�Ӳ���");
		//���޹޴� ���� �ڷ����� ���� �Ű������� ���� ��� ���� �߻�
		//overload.display(12.34);
		System.out.println("===================================================");
	}
}
