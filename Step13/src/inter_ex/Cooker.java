package inter_ex;

public class Cooker {
	private String name;

	public Cooker(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void cooking() {
		System.out.println(name + " 요리사가 음식을 만들고 있습니다.");
	}
}


