package inheritance;

//��������(�����ȣ,�����̸�,���ǰ���)�� �����ϱ� ���� Ŭ����
// =>  �����ȣ�� �����̸� ���� �Ӽ��� ������ AcademyPerson Ŭ������ ��ӹ޾� ���
public class AcademyInstructor extends AcademyPerson {
	private String subject;
	
	public AcademyInstructor() {
		// TODO Auto-generated constructor stub
	}

	public AcademyInstructor(int num, String name, String subject) {
		super(num, name);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("�����ȣ = "+getNum());
		System.out.println("�����̸� = "+getName());
		System.out.println("���ǰ��� = "+subject);
	}
}
