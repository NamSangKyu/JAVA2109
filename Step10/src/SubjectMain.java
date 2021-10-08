
public class SubjectMain {

	public static void main(String[] args) {
		Subject s = new Subject("국어", 95);
		s.printSubjectInfo();
		
//		s.score = 110;
		s.printSubjectInfo();
		//method도 접근제어자가 private 걸려있으면 외부에선 사용 불가
//		System.out.println(s.getGrade());
	}

}
