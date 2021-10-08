
/*
 * 과목정보를 나타낼 클래스
 * 		필드
	  		과목명
	  		점수
	  	생성자
	  		모든 필드를 초기화하는 생성자
	  	메서드
 * 			과목정보를 출력하는 메서드
 * 				과목명 점수 등급
 */
public class Subject {
	String subjectName;
	int score;

	//Alt + Shift + s --> o  필드 초기화하는 생성자
	public Subject(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}
	String getGrade() {
		//성적 등급을 구해서 되돌려줌
		if(score >= 90)			return "A";
		else if(score >= 80) 	return "B";
		else if(score >= 70)	return "C";
		else if(score >= 60)	return "D";
		else 					return "F";
		
	}
	
	void printSubjectInfo() {
		System.out.println("과목명 : "+subjectName);
		System.out.println("점수 : "+score+"("+getGrade()+")");
	}	
}








