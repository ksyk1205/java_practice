package ch08_2;

public class human {
	//���� 8-2. 8-1���� �ٷ� ���������� �ذ�ǵ��� humanŬ������ ��������.
	//�ʵ�(field)
	private String name; //�̸�
	private int height;  //����
	private int weight;  //������
	
	/* ������ */
	human(String n,int h, int w){
		name=n; 
		height=h;
		weight=w;
	}
	
	String getName() {
		return name;
	}
	int getHeight() {
		return height;
	}
	int getWeight() {
		return weight;
	}
	
	void gainWeight(int W) {
		weight += W; //���� ���.
	}
	void reduceWeight(int W) {
		weight -= W; //���� ���.
	}

	

}
