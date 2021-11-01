package init;

public class RunnableRun implements Runnable{
	
	//자동으로 수행할 메서드
	@Override
	public void run() {
		for(int i=0;i<1000000;i++);
		System.out.println(Thread.currentThread().getName() + " - 스레드 종료");
	}

}
