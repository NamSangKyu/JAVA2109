package priority;

public class ThreadPriority extends Thread {

	public ThreadPriority(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++)
				Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + "스레드 종료");
	}

}


