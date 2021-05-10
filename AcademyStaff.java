package inheritance;

//��������(������ȣ,�����̸�,�ٹ��μ�)�� �����ϱ� ���� Ŭ����
//=>  ������ȣ�� �����̸� ���� �Ӽ��� ������ AcademyPerson Ŭ������ ��ӹ޾� ���
public class AcademyStaff extends AcademyPerson {
	private String depart;
	
	public AcademyStaff() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStaff(int num, String name, String depart) {
		super(num, name);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	@Override
	public void display() {
		System.out.println("������ȣ = "+getNum());
		System.out.println("�����̸� = "+getName());
		System.out.println("�ٹ��μ� = "+depart);
	}
}
