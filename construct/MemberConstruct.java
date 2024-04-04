package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	
	//추가 생성자가 2개라 생성자 오버로딩.
	MemberConstruct(String name, int age) { // -> MemberConstruct(String name, int age, int grade ) 부른다. 밑에 메소드 
		this(name,age,50); //변경

	}
	
	MemberConstruct(String name, int age, int grade) {
		System.out.println("생성자 호출 name =" + name + " age = "+ age +" grade = "+ grade);
		
		this.name = name;
		this.age = age;
		this.grade =grade;
	}
}
