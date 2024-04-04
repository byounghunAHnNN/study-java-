package ref;

public class Method1 {

	public static void main(String[] args) {
		Student student1 = new Student(); // x001
		initStudent(student1, "학생1", 15 , 90);
				
		
		Student student2 = new Student(); //x002
		initStudent(student2, "학생2", 16 , 85);
		
		printStudent(student1);
		printStudent(student2);
	
	}
	
		static void initStudent(Student student, String name, int age, int grade) {
			student.name = name;
			student.age =  age;
			student.grade = grade;
			
		}
		
		
		static void printStudent ( Student student ) {
			
			System.out.println(" name : " + student.name + " age : " + student.age +  " grade : " + student.grade);
		}

}
