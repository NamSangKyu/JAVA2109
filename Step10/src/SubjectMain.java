
public class SubjectMain {

	public static void main(String[] args) {
		Subject s = new Subject("국어", 95);
		s.printSubjectInfo();
		
//		s.score = 110;
		//set get 외부에서 데이터를 받거나 setting 하는것이 가능
		s.setScore(84);
		System.out.println(s.getScore());
		
		s.printSubjectInfo();
		//method도 접근제어자가 private 걸려있으면 외부에선 사용 불가
//		System.out.println(s.getGrade());
	}

}
