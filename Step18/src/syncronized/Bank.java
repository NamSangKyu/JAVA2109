package syncronized;

public class Bank {
	private int money;

	public Bank() {
		money = 1000;
	}
	
	public synchronized int tansMoney(int money) {
		this.money -= money;
		return this.money;
	}
}
