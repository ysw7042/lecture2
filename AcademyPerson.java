package inheritance;

//�п��������(��ȣ,�̸�)�� �����ϱ� ���� Ŭ����
// => �л�,����,������ ���� �������� �Ӽ��� ������ �����ϱ� ���� Ŭ����
// => �ڵ��� �ߺ����� �ּ�ȭ�Ͽ� ���α׷��� ���꼺 �� ���������� ȿ���� ����
// => �п� �����ڿ� ���� Ŭ������ �ݵ�� ��ӹ޾ƾ� �Ǵ� Ŭ����
public class AcademyPerson {
	private int num;
	private String name;
	
	public AcademyPerson() {
		// TODO Auto-generated constructor stub
	}

	public AcademyPerson(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("��ȣ = "+num);
		System.out.println("�̸� = "+name);
	}
}
