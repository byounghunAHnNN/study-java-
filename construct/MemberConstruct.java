package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	
	//�߰� �����ڰ� 2���� ������ �����ε�.
	MemberConstruct(String name, int age) { // -> MemberConstruct(String name, int age, int grade ) �θ���. �ؿ� �޼ҵ� 
		this(name,age,50); //����

	}
	
	MemberConstruct(String name, int age, int grade) {
		System.out.println("������ ȣ�� name =" + name + " age = "+ age +" grade = "+ grade);
		
		this.name = name;
		this.age = age;
		this.grade =grade;
	}
}
