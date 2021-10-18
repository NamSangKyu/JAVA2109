package inter_ex;

public class Employee implements Pay{
	private String name;
	private String position;
	public Employee(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void work() {
		System.out.println(name + " 직원이 업무를 봅니다");
	}
	@Override
	public void pay(int money) {
		System.out.println(name + " 회사원은 월급으로 "+money +"원 받았습니다.");
	}
	
	
}
