package inter_ex;

public class Player {
	private String name;
	private int backNumber;
	
	public Player(String name, int backNumber) {
		super();
		this.name = name;
		this.backNumber = backNumber;
	}
	
	public void play() {
		System.out.println(name + " 선수가 경기를 뛰고 있습니다.");
	}
	
	
}
