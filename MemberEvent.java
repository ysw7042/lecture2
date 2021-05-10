package inheritance;

//�̺�Ʈ ���� ȸ������(���̵�, �̸�, �̸���)�� �����ϱ� ���� Ŭ����
// => ȸ�������� �����ϴ� Member Ŭ������ ��ӹ޾� �ۼ��ϴ� ���� ����
//extends Ű���带 �̿��Ͽ� ���� Ŭ����(�θ� Ŭ���� - Super Class)��  ��ӹ޾� ���ο� 
//Ŭ����(�ڽ� Ŭ���� - Sub Class)�� �ۼ�
// => �ڽ� Ŭ���������� �θ� Ŭ������ �ʵ� �Ǵ� �޼ҵ忡 �����Ͽ� ��� - ��Ӽ�(Inheritance)
// => ���� ��Ӹ� ���� - �θ� Ŭ������ �ϳ��� ���� ���� 
public class MemberEvent extends Member {
	/*
	//�θ� Ŭ����(Member)�� ��� �޾����Ƿ� �ʵ� �̼���
	private String id;
	private String name;
	*/
	private String email;
	
	//super : �ڽ� Ŭ������ �޼ҵ忡�� �θ� �ν��Ͻ��� �����ϱ� ���� �Ű�����(Ű����)
	// => super Ű���带 �̿��Ͽ� �θ� �ν��Ͻ��� �ʵ� �Ǵ� �޼ҵ忡 �����Ͽ� ��� ����
	// => super Ű���带 ������� �ʾƵ� �θ� �ν��Ͻ��� �ʵ� �Ǵ� �޼ҵ� ���� ����
	//this Ű����� �ʵ� �Ǵ� �޼ҵ带 �����Ͽ� ���� ��� super Ű����� �ʵ� �Ǵ� �޼ҵ� ����
	
	//super Ű���带 ǥ���ϴ� ���
	//1.�ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
	// => ������ ȣ�� ��� ���� �ٸ� ����� �ۼ��� ��� ���� �߻�
	// => �θ� Ŭ������ �Ű������� ����� �����ڸ� ȣ���Ͽ� �θ� �ν��Ͻ� �ʵ忡 �ʱ�ȭ �۾�
	//2.�ڽ� Ŭ������ �������̵� �޼ҵ忡�� �θ� Ŭ������ ������ �޼ҵ带 ȣ���ϱ� super ���
	
	public MemberEvent() {
		//�θ� Ŭ������ �Ű������� ���� �����ڰ� ���� ��� ���� �߻�
		//super();//�θ� Ŭ������ �Ű������� ���� ������(�⺻ ������) ȣ�� - ���� ����
	}

	/*
	public MemberEvent(String id, String name, String email) {
		super();
		//�ڽ� Ŭ�������� �ʵ� �Ǵ� �޼ҵ� ���� ���� : �ڽ� Ŭ���� ���� >> �θ� Ŭ���� ����
		// => �θ� Ŭ������ ����ȭ ����� �ʵ� �Ǵ� �޼ҵ� ���� �Ұ���
		//this.id = id;
		super.setId(id);//�θ� �ν��Ͻ��� �޼ҵ� ȣ��
		//this.name = name;
		setName(name);
		this.email = email;
	}
	*/
	
	//[Alt]+[Shift]+[S] >> [O] >> �θ� Ŭ������ ������ ���� >>�ʵ� ���� >> Generate
	public MemberEvent(String id, String name, String email) {
		super(id, name);//�θ� Ŭ������ �Ű������� �ִ� ������ ȣ�� - �ʵ� �ʱ�ȭ �۾�
		this.email = email;
	}	

	/*
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//�޼ҵ� �������̵�(Method Override) : ��� ���迡�� �θ� Ŭ������ �޼ҵ带 �ڽ� 
	//Ŭ�������� �缱���ϴ� ��� - �θ� Ŭ������ �޼ҵ�� ���� �������� ����
	// => ����������, ��ȯ��,�޼ҵ��,�Ű�����,���� ������ ��� ������ ����
	// => �θ� Ŭ������ �޼ҵ�� �������� �ڽ� Ŭ������ �޼ҵ常 ��� ����
	/*
	public void display() {
		//System.out.println("���̵� = "+id);
		System.out.println("���̵� = "+getId());
		//System.out.println("�̸� = "+name);
		System.out.println("�̸� = "+getName());
		System.out.println("�̸��� = "+email);
	}
	*/
	
	//��Ŭ�������� �θ� Ŭ������ �޼ҵ带 �������̵� �����ϴ� ���
	//�������̵� ������ �޼ҵ�� �Է� >> [Ctrl]+[Space] >> Override ����(����)
	//@Override : �������̵� �޼ҵ带 ǥ���ϱ� ���� ������̼�(Annotation)
	// => �������̵� �ۼ� ��Ģ�� ������ ��� ���� �߻�
	//������̼�(Annotation) : API ������ Ư���� ������ �ۼ��ϱ� ���� ��� ����
	// => Java Source�� Ư���� ����� �����ϱ� ���� ���
	@Override
	public void display() {
		super.display();//super Ű���带 �̿��Ͽ� �θ� Ŭ������ �޼ҵ� ȣ��
		System.out.println("�̸��� = "+email);
	}
}
