
public class Student {
	String studentNo;
	String name;
	String major;
	double score;
	
	public Student() {

	}

	public Student(String studentNo, String name, String major, double score) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
		this.score = score;
	}

	public Student(String studentNo, String name) {
		super();
		this.studentNo = studentNo;
		this.name = name;
	}
	
	void printStudentInfo() {
		System.out.println("학번 : "+studentNo);
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+major);
		System.out.println("평점 : "+score);
	}
	
	
	
}



