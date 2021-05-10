package association;

//�ڵ��� ����(�𵨸�, ����⵵, ����)�� �����ϱ� ���� Ŭ����
public class Car {
	private String modelName;
	private int productionYear;
	//��������(Engine �ν��Ͻ�)�� �����ϱ� ���� ���� �ʵ� - ���԰���
	// => ���԰��谡 �����Ǳ� ���ؼ��� ������ �Ǵ� Setter �޼ҵ带 �̿��Ͽ� �ʵ忡 �ν��Ͻ� ����
	private Engine carEngine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String modelName, int productionYear, Engine carEngine) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.carEngine = carEngine;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	
	public void carDisplay() {
		System.out.println("�𵨸� = "+modelName);
		System.out.println("����⵵ = "+productionYear);
		//System.out.println("�������� = "+carEngine);
		
		//�����ʵ忡 ����� �ν��Ͻ��� �޼ҵ� ȣ��
		// => �����ʵ忡 �ν��Ͻ��� ����Ǿ� ���� ���� ���¿��� �޼ҵ� ȣ��� NullPointerException �߻�
		//NullPointerException : ���������� NULL�� ����� ���¿��� �޼ҵ带 ȣ���� ��� �߻��Ǵ� ����(Exception)
		/*
		System.out.println("����Ÿ�� = "+carEngine.getFualType());
		System.out.println("��ⷮ = "+carEngine.getDisplacement());
		*/
		carEngine.engineDisplay();
	}
}






