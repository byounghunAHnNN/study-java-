package ref;

public class Method2 {

	public static void main(String[] args) {
		
		Student student1 = createStudent("�л�1", 15 , 90);
		Student student2 = createStudent("�л�2", 18 , 80);

		
		printStudent(student1);
		printStudent(student2);
	
	}
	
		static Student createStudent(String name , int age, int grade) {
			Student student = new Student(); // x001
			student.name = name;
			student.age =  age;
			student.grade = grade;
			return student; // x001
		}
	

		
		static void printStudent ( Student student ) {
			
			System.out.println(" name : " + student.name + " age : " + student.age +  " grade : " + student.grade);
		}

}
